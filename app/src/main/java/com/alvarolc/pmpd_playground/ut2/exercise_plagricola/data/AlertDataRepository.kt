package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data

import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertRepository

class AlertDataRepository (private val alertRemoteSource: AlertRemoteSource): AlertRepository {

    override fun getAlerts(): List<AlertModel> {
        return alertRemoteSource.getAlerts()
    }

    override fun getAlert(alert_id: String): AlertModel? =
        alertRemoteSource.getAlert(alert_id)
}

