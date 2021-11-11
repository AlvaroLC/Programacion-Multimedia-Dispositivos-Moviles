package com.alvarolc.pmpd_playground.ut2.ut02_ex02.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.databinding.ActivityUt02Ex02Binding
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.data.UserDataRepository
import com.alvarolc.pmpd_playground.ut2.ut02_ex02.domain.GetUserUseCase

class Ut02Ex02Activity : AppCompatActivity() {

    private val viewModel = Ut02Ex02ViewModel(GetUserUseCase(UserDataRepository()))
    private val userAdapter = UserAdapter()
    private val bind: ActivityUt02Ex02Binding by lazy {
        ActivityUt02Ex02Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
        setupView()
        exampleInflateView()
        exampleRecyclerView()
    }

    private fun setupView(){
        bind.listUsers.adapter = userAdapter
        bind.listUsers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun exampleInflateView(){
        val view = layoutInflater.inflate(R.layout.view_item_ut02_ex02,bind.root, false)
        bind.wrapContent.addView(view)
    }

    private fun exampleRecyclerView(){
        val users = viewModel.getUsers()
        userAdapter.setItems(users)
    }
}