package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Ut02Ex06FormFragment : Fragment() {

    private lateinit var binding: FragmentUt02Ex06FormBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUt03Ex06FormBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun createInstance() = Ut02Ex06FormFragment()
    }

}