package com.alvarolc.pmpd_playground.ut3.ex06.domain

interface PlayerRepository {
    suspend fun fetchAll(): List<PlayerModel>
    fun save(players: List<PlayerModel>)
}