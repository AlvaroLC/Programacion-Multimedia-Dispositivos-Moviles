package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import androidx.core.text.HtmlCompat
import androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityAlertDetailsBinding
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.app.AlertRetrofitApiClient
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertDataRepository
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.data.AlertRemoteSource
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertIdUseCase
import com.alvarolc.pmpd_playground.ut2.exercise_plagricola.domain.GetAlertsUseCase

class AlertDetailsActivity : AppCompatActivity() {

    private val viewModelDetails =
        AlertDetailsViewModel(GetAlertIdUseCase(AlertDataRepository(AlertRemoteSource(AlertRetrofitApiClient()))))

    private val bind: ActivityAlertDetailsBinding by lazy {
        ActivityAlertDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        loadAlert()
    }

    private fun setupView(){
        setContentView(bind.root)
    }

    private fun loadAlert(){

        //pintamos
        Thread(Runnable {
            val alert = viewModelDetails.getAlertById(getAlertId())
            alert?.let {
                runOnUiThread {
                    bind.textTitleNotice.text = it.title
                    bind.fileTitle.text = alert.files[0].name
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                        bind.body.setText(Html.fromHtml(alert.body, Html.FROM_HTML_MODE_COMPACT))
                    }else{
                        null
                    }
                }
            }


        }).start()
    }

    private fun getAlertId(): String =
        intent.extras!!.getString(KEY_ALERT_ID, "0")


    companion object {
        private val KEY_ALERT_ID = "key_alert_id"

        fun getIntent(context: Context, alertId: String): Intent{
            val intent = Intent(context, AlertDetailsActivity::class.java)
            intent.putExtra(KEY_ALERT_ID, alertId)
            return intent
        }

    }
}