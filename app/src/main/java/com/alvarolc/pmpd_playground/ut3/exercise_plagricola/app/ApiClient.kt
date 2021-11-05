package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.app

import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel

interface ApiClient {
    fun getAlerts(): List<AlertModel>
}