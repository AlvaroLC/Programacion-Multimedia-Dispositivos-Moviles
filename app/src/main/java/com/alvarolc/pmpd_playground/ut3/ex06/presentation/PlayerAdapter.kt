package com.alvarolc.pmpd_playground.ut3.ex06.presentation


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alvarolc.pmpd_playground.R

class PlayerAdapter : RecyclerView.Adapter<PlayerViewHolder>() {
    private val dataSet = mutableListOf<PlayerViewState>()

    fun setItems(items: List<PlayerViewState>){
        dataSet.clear()
        addItems(items.toMutableList())
    }

    private fun addItems(items: MutableList<PlayerViewState>){
        dataSet.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_player, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size


}