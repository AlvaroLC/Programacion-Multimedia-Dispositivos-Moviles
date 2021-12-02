package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase

class AlertViewModel(private val useCase: GetAlertsUseCase): ViewModel() {
    fun getAlerts(): List<AlertViewState> {
        val alerts = useCase.execute()
        return alerts.map { alertModel ->
            AlertViewState(
                alertModel.id,
                alertModel.title,
                alertModel.type,
                alertModel.summary,
                alertModel.datePublished,
                alertModel.body,
                alertModel.source,
                alertModel.files
            )
        }
    }
}