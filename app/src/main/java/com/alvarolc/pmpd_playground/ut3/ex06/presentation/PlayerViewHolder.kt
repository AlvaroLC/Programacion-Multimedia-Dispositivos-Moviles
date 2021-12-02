package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alvarolc.pmpd_playground.databinding.ViewItemPlayerBinding

class PlayerViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val bind = ViewItemPlayerBinding.bind(view)

    fun render(alertViewState: PlayerViewState){
        bind.labelPlayerName.text = alertViewState.name
        bind.comunityPlayer.text = alertViewState.comunity
        bind.playerGender.text = alertViewState.gender
        bind.playerPosition.text = alertViewState.position
    }
}