package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut3.ex06.domain.GetPlayerUseCase

class Ut03Ex06FormViewModel(private val getPlayerUseCase: GetPlayerUseCase): ViewModel() {

    fun savePlayer() {
        fun savePlayers() = getPlayerUseCase.execute()
    }

}