package com.alvarolc.pmpd_playground.ut3.ex06.domain

class GetPlayerUseCase(val playerRepository: PlayerRepository){

    fun execute(): List<PlayerModel> {
        return playerRepository.getPlayers()
    }
}