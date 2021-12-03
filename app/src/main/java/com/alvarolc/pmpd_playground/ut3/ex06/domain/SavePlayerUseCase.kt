package com.alvarolc.pmpd_playground.ut3.ex06.domain

class SavePlayerUseCase(private val playerRepository: PlayerRepository) {

    fun execute(param: List<Param>) {
        playerRepository.save(param.map { param -> param.toModel()  })

    }

    data class Param(
        val name: String,
        val surname: String,
        val comunity: String,
        val gender: String,
        val position: List<String>
    ) {
        fun toModel() =
            PlayerModel(
                name,
                surname,
                comunity,
                gender,
                position
            )
    }
}