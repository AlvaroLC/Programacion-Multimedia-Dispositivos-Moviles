package com.alvarolc.pmpd_playground.ut3.ex06.domain

interface PlayerRepository {
    fun getPlayers(): List<PlayerModel>
}