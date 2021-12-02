package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app
/**
 * Abstracción del cliente que vamos a usar en la actividad.
 */

interface ApiClient {
    fun getAlerts(): List<AlertApiModel>
    fun getAlert(alert_id:String):AlertDetailsModel?
}