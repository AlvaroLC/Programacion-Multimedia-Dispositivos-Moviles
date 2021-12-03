package com.alvarolc.pmpd_playground.ut3.ex06.data

import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel
import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerRepository

class PlayerDataRepository(private val playerLocalSource: PlayerLocalSource): PlayerRepository {

    override suspend fun fetchAll(): List<PlayerModel> {
        return playerLocalSource.findAll()
    }

    override fun save(players: List<PlayerModel>)  {
        playerLocalSource.save(players)
    }
}