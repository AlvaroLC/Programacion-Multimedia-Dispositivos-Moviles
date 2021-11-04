package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain


interface AlertRepository {

    fun getAlertAll() : List<AlertModel>
}