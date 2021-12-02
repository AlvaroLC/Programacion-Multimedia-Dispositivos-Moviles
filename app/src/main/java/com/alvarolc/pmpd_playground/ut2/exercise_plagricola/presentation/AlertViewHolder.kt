package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alvarolc.pmpd_playground.databinding.ViewItemAlertBinding
import java.lang.Integer.parseInt

class AlertViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val bind = ViewItemAlertBinding.bind(view)

    fun render(alertViewState: AlertViewState){
        bind.textTitleNotice.text = alertViewState.title
        bind.dateNotice.text = alertViewState.datePublished
        bind.summaryNotice.text = alertViewState.summary
        view.setOnClickListener{
            view.context.startActivity(SecondActivity.getIntent(view.context, parseInt(alertViewState.id)))
        }
    }
}