package com.alvarolc.pmpd_playground.ut3.ex06.data

import com.alvarolc.pmpd_playground.ut3.ex06.app.PlayerApiClient
import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel


class PlayerRemoteSource(private val playerApiClient: PlayerApiClient){
    fun getPlayers():List<PlayerModel>{
        return playerApiClient.getPlayers().map { it.toPlayerModel() }
    }

}