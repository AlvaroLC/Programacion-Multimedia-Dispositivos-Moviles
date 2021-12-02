package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut3.ex06.domain.GetPlayerUseCase


class Ut03Ex06ListViewModel(private val useCase: GetPlayerUseCase): ViewModel() {

    fun getPlayers(): List<PlayerViewState> {
        val players = useCase.execute()
        return players.map { playerModel ->
            PlayerViewState(
                playerModel.name,
                playerModel.surname,
                playerModel.comunity,
                playerModel.gender,
                playerModel.position
            )
        }
    }
}