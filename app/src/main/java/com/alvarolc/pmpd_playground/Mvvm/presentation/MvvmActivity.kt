package com.alvarolc.pmpd_playground.Mvvm.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.alvarolc.pmpd_playground.R

class MvvmActivity : AppCompatActivity() {

    private val viewModel: MvvmViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)
    }

    private fun render(){
        val mvvmModel = viewModel.getAllMvvm()
    }
}