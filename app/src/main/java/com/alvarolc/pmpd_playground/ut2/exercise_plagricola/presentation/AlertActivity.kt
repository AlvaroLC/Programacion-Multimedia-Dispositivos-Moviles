package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvarolc.pmpd_playground.databinding.ActivityAlertBinding
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.AlertRetrofitApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertRemoteSource

class AlertActivity : AppCompatActivity() {

    private val alertRepository = AlertDataRepository(AlertRemoteSource(AlertRetrofitApiClient()))
    private lateinit var viewBinding: ActivityAlertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        render()
    }

    private fun setupBinding(){
        viewBinding = ActivityAlertBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }

    private fun render() {
        /**  val alertModel = alertViewModel.getAlertModel().first()
        viewBinding.textTitleNotice.text = alertModel.title
        viewBinding.dateNotice.text = alertModel.datePublished
        viewBinding.summaryNotice.text = alertModel.summary*/
        Thread(Runnable {
            val alerts = alertRepository.getAlerts().first()
            runOnUiThread {
                viewBinding.textTitleNotice.text = alerts.title
                viewBinding.dateNotice.text = alerts.datePublished
                viewBinding.summaryNotice.text = alerts.summary
            }

        }).start()
    }


}

