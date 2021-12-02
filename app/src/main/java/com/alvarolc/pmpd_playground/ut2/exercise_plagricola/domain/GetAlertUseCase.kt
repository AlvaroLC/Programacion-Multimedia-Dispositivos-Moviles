package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain


class GetAlertsUseCase(private val alertRepository: AlertRepository) {
    fun execute(): List<AlertModel> = alertRepository.getAlerts()
}
