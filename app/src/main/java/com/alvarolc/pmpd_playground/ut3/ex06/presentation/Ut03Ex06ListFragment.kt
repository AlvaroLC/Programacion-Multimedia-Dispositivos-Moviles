package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alvarolc.pmpd_playground.databinding.ListFragmentEx06Binding

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

    companion object {
        val TAG: String = Ut03Ex06FormFragment::class.java.simpleName
        fun createInstance() = Ut03Ex06ListFragment()
    }

}