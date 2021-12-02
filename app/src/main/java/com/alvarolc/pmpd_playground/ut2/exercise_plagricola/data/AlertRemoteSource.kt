package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data

import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.ApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertModel

class AlertRemoteSource(private val apiClient: ApiClient){
    fun getAlerts():List<AlertModel>{
        return apiClient.getAlerts().map { it.toAlertModel() }
    }


    fun getAlert(alert_id: String): AlertModel? =
        apiClient.getAlert(alert_id)?.toModel()
}