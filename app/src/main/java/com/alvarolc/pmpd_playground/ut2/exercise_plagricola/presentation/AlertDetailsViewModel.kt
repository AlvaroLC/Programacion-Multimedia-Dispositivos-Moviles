package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertIdUseCase
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase

class AlertDetailsViewModel(private val useCase: GetAlertIdUseCase): ViewModel() {

    fun getAlertById(alertId: String) = useCase.execute(alertId)

}