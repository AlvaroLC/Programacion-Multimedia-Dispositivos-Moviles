package com.alvarolc.pmpd_playground.ut3.ex06.domain


class GetPlayerUseCase(private val playerRepository: PlayerRepository) {
    suspend fun execute(): List<PlayerModel> {
        return playerRepository.fetchAll()
    }
}