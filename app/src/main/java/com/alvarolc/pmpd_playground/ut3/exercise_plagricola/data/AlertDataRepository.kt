package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data

import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertRepository
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.FileModel

class AlertDataRepository (private val alertRemoteSource: AlertRemoteSource): AlertRepository {

    override fun getAlertAll(): List<AlertModel> {
        return alertRemoteSource.getAlertAll()
    }

}
