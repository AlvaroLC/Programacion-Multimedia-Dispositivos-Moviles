package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ListFragmentEx06Binding
import com.alvarolc.pmpd_playground.ut3.ex06.app.MockApiClient
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerDataRepository
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerRemoteSource
import com.alvarolc.pmpd_playground.ut3.ex06.domain.GetPlayerUseCase

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

    private val viewModel =
        Ut03Ex06ListViewModel(GetPlayerUseCase(PlayerDataRepository(PlayerRemoteSource(MockApiClient()))))

    private val playerAdapter = PlayerAdapter()
    private val bind: ListFragmentEx06Binding by lazy {
        ListFragmentEx06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        exampleInflateView()
        exampleRecyclerView()

    }

    private fun setupView() {
        bind.listUsers.adapter = playerAdapter
        bind.listUsers.layoutManager =
            LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
    }

    private fun exampleInflateView() {
        val view = layoutInflater.inflate(R.layout.list_fragment_ex06, bind.root, false)
        bind.wrapContent.addView(view)
    }

    private fun exampleRecyclerView() {
        Thread(Runnable {
            val alerts = viewModel.getPlayers()
            playerAdapter.setItems(alerts)
        }).start()
    }

    companion object {
        val TAG: String = Ut03Ex06FormFragment::class.java.simpleName
        fun createInstance() = Ut03Ex06ListFragment()
    }

}