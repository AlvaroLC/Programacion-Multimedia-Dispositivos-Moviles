package com.alvarolc.pmpd_playground.UT2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.alvarolc.pmpd_playground.R
import com.alvarolc.pmpd_playground.ut3.UiActivity

class UiActivity2 : AppCompatActivity() {

    private val TAG: String = UiActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui2)
        initPlayGround()
        //setupView()
    }
    /**
    private fun setupView(){
        setupTitleTapa()
    }

    private fun setupTitleTapa(){
        val labelTitleTapa: AppCompatTextView = findViewById(R.id.text)
        labelTitleTapa.text = getText(R.string.app_name)
    }*/

    private fun initPlayGround(){
        //textPlayGround()
    }

    private fun textPlayGround(){
        val textView : AppCompatTextView = findViewById(R.id.label_x)
        textView.text = getString(R.string.app_name)
        textView.setText(R.string.app_name)
        textView.setTextColor(ContextCompat.getColor(this, R.color.black))
    }

    private fun editTextPlayGround(){
        val input : AppCompatEditText = findViewById(R.id.input_x)
        input.setHint(R.string.app_name)
        input.setText(R.string.app_name)
        val text = input.text.toString()
    }

    private fun editTextWithLabelPlayGround(){
        val inputLabel : AppCompatEditText = findViewById(R.id.input_2x)
        val text = inputLabel.text.toString()
    }

    private fun imageviewPlayGround(){
        val image : AppCompatImageView = findViewById(R.id.image01)
        //image.setImageResource(R.drawable.ic_image_lion)
        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_image_lion))
    }

    private fun buttonPlayGround(){
        val button : AppCompatButton = findViewById(R.id.button01)
        button.text = ""
    }
}