package com.alvarolc.pmpd_playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("@dev","onCreate")
        setContentView(R.layout.activity_main)

        //val imageLion : AppCompatImageView = findViewById(R.id.ic_image_lion)
        //imageLion.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_image_lion))
        //imageLion.setImageResource(R.drawable.ic_image_lion)

    }

    override fun onStart(){
        super.onStart()
        Log.d("@dev","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("@dev","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("@dev","onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("@dev","onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("@dev","onDestroy")
    }
}