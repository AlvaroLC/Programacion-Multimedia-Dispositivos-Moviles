package com.alvarolc.pmpd_playground.ut3.ex06.app

import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel

/**
 * Abstracción del cliente que vamos a usar en la actividad.
 */
interface PlayerApiClient {
    fun getPlayers(): List<PlayerApiModel>
}