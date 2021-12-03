package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alvarolc.pmpd_playground.databinding.ViewItemPlayerBinding

class PlayerViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val bind = ViewItemPlayerBinding.bind(view)

    fun render(playerViewState: PlayerViewState){
        bind.labelPlayerName.text = playerViewState.name +" "+ playerViewState.surname
        bind.comunityPlayer.text = playerViewState.comunity
        bind.playerGender.text = playerViewState.gender
        bind.playerPosition.text = playerViewState.position?.toString()
    }
}