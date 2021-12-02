package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain.GetUserUseCase
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.presentation.UserViewState

/**
class AlertViewModel(private val getAlertsUseCase: GetAlertsUseCase) : ViewModel() {
    fun getAllAlerts() = getAlertsUseCase.execute()
}*/

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