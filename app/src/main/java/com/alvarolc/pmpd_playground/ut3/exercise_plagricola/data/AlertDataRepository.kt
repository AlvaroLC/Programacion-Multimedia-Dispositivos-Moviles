package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data

import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertRepository

class AlertDataRepository: AlertRepository {

    override fun getAlertAll(): List<AlertModel> {
        mutableListOf()
    }

}
