package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarolc.pmpd_playground.commons.GsonSerializer
import com.alvarolc.pmpd_playground.databinding.ListFragmentEx06Binding
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerDataRepository
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerFileLocalSource
import com.alvarolc.pmpd_playground.ut3.ex06.domain.GetPlayerUseCase
import com.google.gson.Gson

class Ut03Ex06ListFragment : Fragment() {

    private lateinit var binding: ListFragmentEx06Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListFragmentEx06Binding.inflate(inflater, container, false)
        return binding.root
    }

    private val ut03Ex06ListViewModel: Ut03Ex06ListViewModel by lazy {
        Ut03Ex06ListViewModel(
            GetPlayerUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(requireContext(), GsonSerializer(Gson()))
                )
            )
        )
    }

    private val playerAdapter = PlayerAdapter()
    private val bind: ListFragmentEx06Binding by lazy {
        ListFragmentEx06Binding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewRecycler()
        setupViewStateObservers()
        ut03Ex06ListViewModel.loadPlayers()
    }

    private fun setupViewRecycler() {
        binding.listUsers.adapter = playerAdapter
        binding.listUsers.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun setupViewStateObservers() {
        val playerObserver = Observer<List<PlayerViewState>> {
            playerAdapter.setItems(it)
        }
        ut03Ex06ListViewModel.playerViewState.observe(requireActivity(), playerObserver)
    }

    companion object {
        val TAG: String = Ut03Ex06FormFragment::class.java.simpleName
        fun createInstance() = Ut03Ex06ListFragment()
    }

}