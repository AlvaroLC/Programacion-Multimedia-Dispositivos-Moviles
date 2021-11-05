package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.presentation

import androidx.lifecycle.ViewModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.GetAlertsUseCase

class AlertViewModel (private val getAlertsUseCase: GetAlertsUseCase) : ViewModel() {
    fun getAlertModel() = getAlertsUseCase.execute()
}