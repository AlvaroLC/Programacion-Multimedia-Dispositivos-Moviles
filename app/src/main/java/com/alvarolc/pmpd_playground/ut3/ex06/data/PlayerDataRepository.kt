package com.alvarolc.pmpd_playground.ut3.ex06.data

import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel
import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerRepository

class PlayerDataRepository(private val playerRemoteSource: PlayerRemoteSource): PlayerRepository {

    override fun getPlayers(): List<PlayerModel> {
        return playerRemoteSource.getPlayers()
    }
}