package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * EndPoints de los servicios que se van a usar.
 * Es requisito de Retrofit crear esta interfaz.
 */
interface AlertApiEndPoint {
    @GET("alerts")
    fun getAlerts(): Call<ApiResponse<List<AlertApiModel>>>

    @GET("alerts/{alert_id}")
    fun getAlert(@Path("alert_id") alert_id: String): Call<ApiResponse<AlertDetailsModel>>

}