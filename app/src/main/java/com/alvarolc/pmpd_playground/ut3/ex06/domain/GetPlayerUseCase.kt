package com.alvarolc.pmpd_playground.ut3.ex06.domain


class GetPlayerUseCase(private val playerRepository: PlayerRepository){

    fun execute(): List<PlayerModel> = playerRepository.getPlayers()

}