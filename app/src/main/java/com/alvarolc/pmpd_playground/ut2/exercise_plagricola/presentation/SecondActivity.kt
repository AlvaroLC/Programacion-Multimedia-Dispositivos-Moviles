package com.alvarolc.pmpd_playground.ut2.exercise_plagricola.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvarolc.pmpd_playground.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    companion object {
        private val KEY_USER_ID = "key_user_id"

        fun getIntent(context: Context, userId: Int): Intent{
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(KEY_USER_ID, userId)
            return intent
        }
    }
}