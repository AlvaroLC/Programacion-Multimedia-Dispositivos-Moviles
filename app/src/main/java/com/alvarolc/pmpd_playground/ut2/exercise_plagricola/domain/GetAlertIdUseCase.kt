package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain


class GetAlertIdUseCase(private val alertRepository: AlertRepository) {
    fun execute(alertId: String): AlertModel? = alertRepository.getAlert(alertId)
}
