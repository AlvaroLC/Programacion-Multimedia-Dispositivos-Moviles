package com.alvarolc.pmpd_playground.ut3.ex06.app

import com.alvarolc.pmpd_playground.ut3.ex06.domain.PlayerModel

data class PlayerApiModel(
    private val name: String,
    private val surname: String,
    private val comunity: String,
    private val gender: String,
    private val position: String,

){
    fun toPlayerModel(): PlayerModel {
        return PlayerModel(name,surname,comunity,gender,position)
    }
}