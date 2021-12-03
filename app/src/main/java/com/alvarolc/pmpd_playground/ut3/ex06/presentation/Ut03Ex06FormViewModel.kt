package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut3.ex06.domain.SavePlayerUseCase

class Ut03Ex06FormViewModel(private val savePLayerUseCase: SavePlayerUseCase) : ViewModel() {
    fun savePlayer(param: List<SavePlayerUseCase.Param>) {
        savePLayerUseCase.execute(param)
    }
}