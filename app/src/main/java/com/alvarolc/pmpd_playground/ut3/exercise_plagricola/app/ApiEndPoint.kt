package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.app

import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * EndPoints de los servicios que se van a usar.
 * Es requisito de Retrofit crear esta interfaz.
 */
interface ApiEndPoint {
    @GET("alerts")
    fun getAlerts(): Call<List<AlertModel>>
}