package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.alvarolc.pmpd_playground.commons.GsonSerializer
import com.alvarolc.pmpd_playground.databinding.FormFragmentEx06Binding
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerDataRepository
import com.alvarolc.pmpd_playground.ut3.ex06.data.PlayerFileLocalSource
import com.alvarolc.pmpd_playground.ut3.ex06.domain.SavePlayerUseCase
import com.google.gson.Gson

class Ut03Ex06FormFragment : Fragment() {

    private lateinit var binding: FormFragmentEx06Binding

    private val ut03Ex06ViewModel: Ut03Ex06FormViewModel by lazy {
        Ut03Ex06FormViewModel(
            SavePlayerUseCase(
                PlayerDataRepository(
                    (PlayerFileLocalSource(
                        requireContext(),
                        GsonSerializer(Gson())
                    ))

                )
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FormFragmentEx06Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }


    private fun setupView() {
        binding.buttonSave.setOnClickListener {
            ut03Ex06ViewModel.savePlayer(savePlayer())
            clearItems()
            Toast.makeText(requireContext(), "Jugador Añadido", Toast.LENGTH_SHORT).show()
        }

    }

    private fun savePlayer(): List<SavePlayerUseCase.Param> {
        val name = binding.userName.text.toString()
        val surname = binding.userLastname.text.toString()
        val comunity = binding.comunityChoose.selectedItem.toString()
        val gender = checkGender()
        val position = checkPositions()
        return mutableListOf(SavePlayerUseCase.Param(name, surname, comunity, gender, position))
    }


    private fun clearItems() {
        binding.userName.text?.clear()
        binding.userLastname.text?.clear()
        binding.genderOptions.clearCheck()
        binding.optionPortero.isChecked = false
        binding.optionDefensa.isChecked = false
        binding.optionMediocentro.isChecked = false
        binding.optionDelantero.isChecked = false
    }

    private fun checkGender(): String {
        var gender: String = ""
        gender = if (binding.radioMasculino.isChecked) {
            "Hombre"
        } else {
            "Mujer"
        }
        return gender
    }


    private fun checkPositions(): List<String> {
        val positionList = mutableListOf<String>()
        if (binding.optionPortero.isChecked) {
            positionList.add("Portero")
        }
        if (binding.optionDefensa.isChecked) {
            positionList.add("Defensa")
        }
        if (binding.optionMediocentro.isChecked) {
            positionList.add("Centrocampista")
        }
        if (binding.optionDelantero.isChecked) {
            positionList.add("Delantero")
        }
        return positionList

    }

    companion object {
        fun createInstance() = Ut03Ex06FormFragment()
    }

}