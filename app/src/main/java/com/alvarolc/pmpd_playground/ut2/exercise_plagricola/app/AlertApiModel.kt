package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app

import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.FileModel


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

data class AlertDetailsModel(
    val id: String,
    val alert_id: String,
    val title: String,
    val type: String,
    val date: String,
    val summary: String,
    val body: String,
    val source: String,
    val files: List<FileApiModel>
) {

    fun toModel(): AlertModel = AlertModel(
        alert_id,
        title,
        type.toInt(),
        summary,
        date,
        body,
        source,
        files.map { fileApiModel -> fileApiModel.toModel() }
    )

}

data class FileApiModel(val id: String, val alert_id: String, val name: String, val url: String) {
    fun toModel(): FileModel = FileModel(name, url)
}
