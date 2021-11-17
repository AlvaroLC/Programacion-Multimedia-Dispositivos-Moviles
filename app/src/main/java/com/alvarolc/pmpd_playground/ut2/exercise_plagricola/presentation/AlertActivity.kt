package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityAlertBinding
import com.alvarolc.pmpd_playground.databinding.ActivityUt02Ex02Binding
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.AlertRetrofitApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.ApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertRemoteSource
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.data.UserDataRepository
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain.GetUserUseCase
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.presentation.UserAdapter
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.presentation.Ut02Ex02ViewModel

class AlertActivity : AppCompatActivity() {

    /**

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
    }*/

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

