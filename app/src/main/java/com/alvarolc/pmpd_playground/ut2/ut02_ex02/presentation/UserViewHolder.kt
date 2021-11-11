package com.alvarolc.pmpd_playground.ut2.ut02_ex02.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alvarolc.pmpd_playground.databinding.ViewItemUt02Ex02Binding

class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val bind = ViewItemUt02Ex02Binding.bind(view)

    fun render(userViewState: UserViewState){
        bind.fullname.text = userViewState.fullName
        bind.age.text = userViewState.age
    }
}