package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain


interface AlertRepository {
    fun getAlerts(): List<AlertModel>
    fun getAlert(alert_id: String): AlertModel?
}