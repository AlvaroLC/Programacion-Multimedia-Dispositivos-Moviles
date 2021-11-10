package com.alvarolc.pmpd_playground.ut3.exercise_plagricola.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityAlertBinding
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.app.MockApiClient
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.app.RetrofitApiClient
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.data.AlertRemoteSource
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.AlertModel
import com.alvarolc.pmpd_playground.ut3.exercise_plagricola.domain.GetAlertsUseCase

class AlertActivity : AppCompatActivity() {

    private val alertViewModel : AlertViewModel=
        AlertViewModel(GetAlertsUseCase(AlertDataRepository(AlertRemoteSource(RetrofitApiClient()))))

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

    private fun render(){
        /**  val alertModel = alertViewModel.getAlertModel().first()
            viewBinding.textTitleNotice.text = alertModel.title
            viewBinding.dateNotice.text = alertModel.datePublished
            viewBinding.summaryNotice.text = alertModel.summary*/

        val threadNetwotk = Thread(Runnable {
            //obtengo la abstracción del ApiClient a usar
            val apiRepository = AlertRemoteSource(RetrofitApiClient())
            //Visualizo el listado de usuarios
            val users = apiRepository.getAlertAll()
            users.forEach { userApiModel ->
                val alertModel = alertViewModel.getAlertModel().first()
                viewBinding.textTitleNotice.text = alertModel.title
                viewBinding.dateNotice.text = alertModel.datePublished
                viewBinding.summaryNotice.text = alertModel.summary
            }

        })
            threadNetwotk.start()
        }


}

