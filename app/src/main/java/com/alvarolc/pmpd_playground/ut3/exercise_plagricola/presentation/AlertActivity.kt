package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityAlertBinding
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.GetAlertsUseCase

class AlertActivity : AppCompatActivity() {

    private val alertViewModel : AlertViewModel=
        AlertViewModel(GetAlertsUseCase(AlertDataRepository()))

    private lateinit var viewBinding: ActivityAlertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        render()
    }

    private fun render(){
        val alertModel = alertViewModel.getAlertAll()
        viewBinding.textTitleNotice.text = alertModel
    }
}