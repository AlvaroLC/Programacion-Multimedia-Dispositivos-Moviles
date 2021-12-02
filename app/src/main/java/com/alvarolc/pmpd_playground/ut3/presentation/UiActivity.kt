package com.alvarolc.pmpd_playground.ut3.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import com.alvarolc.pmpd_playground.R

class UiActivity : AppCompatActivity() {
    private val TAG: String = UiActivity::class.java.name

    private lateinit var labelTextTitleRestaurant : TextView
    private lateinit var labelTextTitleTypeRestaurant : TextView
    private lateinit var labelRatingNumber : TextView
    private lateinit var labelViewOpinions : TextView
    private lateinit var labelAvailableCurrency : TextView
    private lateinit var labelTextDiscountNumber : TextView
    private val viewModel = UiViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_exercise_restaurant1)
        //initPlayGround()
        setupView()
        render()
    }

    private fun setupView() {
        labelTextTitleRestaurant = findViewById(R.id.text_title_restaurant)
        labelTextTitleTypeRestaurant = findViewById(R.id.text_type_restaurant)
        labelRatingNumber = findViewById(R.id.text_rating_number)
        labelViewOpinions = findViewById(R.id.text_view_opinions)
        labelAvailableCurrency = findViewById(R.id.text_available_currency)
        labelTextDiscountNumber = findViewById(R.id.text_discount_number)
        /**setupTitleRestaurant()
        setupTitleTypeRestaurant()
        setupRatingNumber()
        setupTextViewOpinions()
        setupTextAvailableCurrency()
        setupTextDiscountNumber()*/
        imageviewIconSoulKitchen()
        imageviewIconDeliveroo()
        imageviewIconGlovo()
        imageviewIconJustEat()
        imageviewIconUberEats()
        imageviewIconDiscountTag()
    }

    private fun setupTitleRestaurant() {
        val labelTitleRestaurant: TextView = findViewById(R.id.text_title_restaurant)
        labelTitleRestaurant.text = getText(R.string.text_title_restaurant)
    }

    private fun setupTitleTypeRestaurant() {
        val labelTitleTypeRestaurant: TextView = findViewById(R.id.text_type_restaurant)
        labelTitleTypeRestaurant.text = getText(R.string.text_title_type_restaurant)
    }

    private fun setupRatingNumber() {
        val labelRatingNumber: TextView = findViewById(R.id.text_rating_number)
        labelRatingNumber.text = getText(R.string.text_rating_number)
    }

    private fun setupTextViewOpinions() {
        val labelTextViewOpinions: TextView = findViewById(R.id.text_view_opinions)
        labelTextViewOpinions.text = getText(R.string.text_view_opinions)
    }

    private fun setupTextAvailableCurrency() {
        val labelTextAvailableCurrency: TextView = findViewById(R.id.text_available_currency)
        labelTextAvailableCurrency.text = getText(R.string.text_available_currency)
    }

    private fun setupTextDiscountNumber() {
        val labelTextDiscountNumber: TextView = findViewById(R.id.text_discount_number)
        labelTextDiscountNumber.text = getText(R.string.text_discount_number)
    }

    private fun imageviewIconSoulKitchen() {
        val image: AppCompatImageView = findViewById(R.id.image_icon_soul_kitchen)
        image.setImageResource(R.drawable.ic_launcher)
    }

    private fun imageviewIconUberEats() {
        val image: AppCompatImageView = findViewById(R.id.image_icon_uber_eats)
        image.setImageResource(R.drawable.ubereats)
    }

    private fun imageviewIconDeliveroo() {
        val image: AppCompatImageView = findViewById(R.id.image_icon_deliveroo)
        image.setImageResource(R.drawable.deliveroo)
    }

    private fun imageviewIconGlovo() {
        val image: AppCompatImageView = findViewById(R.id.image_icon_glovo)
        image.setImageResource(R.drawable.glovo)
    }

    private fun imageviewIconJustEat() {
        val image: AppCompatImageView = findViewById(R.id.image_icon_just_eat)
        image.setImageResource(R.drawable.justeat)
    }

    private fun imageviewIconDiscountTag() {
        val image: AppCompatImageView = findViewById(R.id.image_discount_tag)
        image.setImageResource(R.drawable.etiqueta)
    }


    private fun render(){
        val tapaModel = viewModel.getTapaModel()
        labelTextTitleRestaurant.setText(tapaModel.titleRestaurant)
        labelTextTitleTypeRestaurant.setText(tapaModel.typeRestaurant)
        labelRatingNumber.setText(tapaModel.textRatingNumber)
        labelViewOpinions.setText(tapaModel.textViewOpinions)
        labelAvailableCurrency.setText(tapaModel.textAvailableCurrency)
        labelTextDiscountNumber.setText(tapaModel.textDiscountNumber)
    }


}