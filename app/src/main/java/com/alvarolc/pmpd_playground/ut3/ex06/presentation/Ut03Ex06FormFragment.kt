package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.alvarolc.pmpd_playground.databinding.FormFragmentEx06Binding

class Ut03Ex06FormFragment : Fragment() {

    private lateinit var binding: FormFragmentEx06Binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FormFragmentEx06Binding.inflate(inflater, container, false)
        return binding.root

    }

    fun savePlayer(){
        val buttonSave = binding.buttonSave

        val name = binding.userName.text
        val lastname = binding.userLastname.text
        val comunity = binding.comunityChoose.selectedItem

        if(binding.radioFemenino.isChecked){
            val sex = "Mujer"
        }else if(binding.radioMasculino.isChecked){
            val sex = "Varon"
        }

        buttonSave.setOnClickListener {
            Log.d("@dev","Entro")
            Log.d("@dev",name.toString())
        }


        //viewModel.save()
    }

    companion object {
        fun createInstance() = Ut03Ex06FormFragment()
    }

}