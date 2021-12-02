package com.alvarolc.pmpd_playground.ut3.ex06.app

import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel

class MockApiClient : PlayerApiClient {
    override fun getPlayers(): List<PlayerModel> =
        mutableListOf(
            PlayerModel("Jesus", "Navas", "Andalucia", "Varón", "Defensa"),
            PlayerModel("Jesus", "Navas", "Andalucia", "Varón", "Defensa"),
            )
}