package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food.*
import kotlinx.android.synthetic.main.food_ticket.*
import kotlinx.android.synthetic.main.food_ticket.tvName

class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val bundle:Bundle = intent.extras!!
        val image = bundle.getInt("image")
        ivFoodimageDetails.setImageResource(image)
        tvName.text = bundle!!.getString("name")
        tvDetails.text = bundle!!.getString("desc")
    }
}
