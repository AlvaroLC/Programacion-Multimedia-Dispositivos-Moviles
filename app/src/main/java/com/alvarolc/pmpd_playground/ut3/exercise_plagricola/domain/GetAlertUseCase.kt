package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain

class GetAlertsUseCase(private val alertRepository: AlertRepository) {
    fun execute(): List<AlertModel> = alertRepository.getAlertAll()
}
