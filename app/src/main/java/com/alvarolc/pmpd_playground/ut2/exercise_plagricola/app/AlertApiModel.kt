package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app

import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertModel

data class AlertApiModel(
    private val alert_id: String,
    private val title: String,
    private val summary: String,
    private val type: String,
    private val date: String,
    val body: String? = "",
    val source: String? = "",
){
    fun toAlertModel(): AlertModel {
        return AlertModel(alert_id, title, type.toInt(),
            summary, date, body ?: "",
            source ?: "", emptyList())
    }
}