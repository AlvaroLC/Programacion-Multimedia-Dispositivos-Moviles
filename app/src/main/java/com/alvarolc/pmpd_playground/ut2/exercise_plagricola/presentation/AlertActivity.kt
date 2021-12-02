package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityAlertBinding
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.AlertRetrofitApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertRemoteSource
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase

class AlertActivity : AppCompatActivity() {

    private val viewModel =
        AlertViewModel(GetAlertsUseCase(AlertDataRepository(AlertRemoteSource(AlertRetrofitApiClient()))))
    private val alertAdapter = AlertAdapter()
    private val bind: ActivityAlertBinding by lazy {
        ActivityAlertBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setupView()
        exampleInflateView()
        exampleRecyclerView()

    }

    private fun setupView() {
        bind.listUsers.adapter = alertAdapter
        bind.listUsers.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun exampleInflateView() {
        val view = layoutInflater.inflate(R.layout.activity_alert, bind.root, false)
        bind.wrapContent.addView(view)
    }

    private fun exampleRecyclerView() {
        Thread(Runnable {
            val alerts = viewModel.getAlerts()
            runOnUiThread {
                alertAdapter.setItems(alerts)
            }
        }).start()
    }
}

