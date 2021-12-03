package com.alvarolc.pmpd_playground.ut3.ex06.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alvarolc.pmpd_playground.ut3.ex06.domain.GetPlayerUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Ut03Ex06ListViewModel(private val useCase: GetPlayerUseCase): ViewModel() {

    val playerViewState: LiveData<List<PlayerViewState>>
        get() = _playersViewState


    private val _playersViewState: MutableLiveData<List<PlayerViewState>> by lazy {
        MutableLiveData<List<PlayerViewState>>()
    }

    fun loadPlayers() = viewModelScope.launch(Dispatchers.Main) {
        val players = useCase.execute()
        _playersViewState.value = players.map {
            PlayerViewState(
                it.name,
                it.surname,
                it.comunity,
                it.gender,
                it.position
            )
        }
    }
}