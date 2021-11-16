package com.example.android.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var box_one_text:TextView
    private lateinit var  box_two_text:TextView
    private lateinit var  box_three_text:TextView
    private lateinit var  box_four_text:TextView
    private lateinit var  box_five_text:TextView
    private lateinit var constraint_layout:ConstraintLayout
    private lateinit var red_button: Button
    private lateinit var yellow_button: Button
    private lateinit var green_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box_one_text = findViewById<TextView>(R.id.box_one_text)
        box_two_text = findViewById<TextView>(R.id.box_two_text)
        box_three_text = findViewById<TextView>(R.id.box_three_text)
        box_four_text = findViewById<TextView>(R.id.box_four_text)
        box_five_text = findViewById<TextView>(R.id.box_five_text)
        constraint_layout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        red_button = findViewById<Button>(R.id.red_button)
        yellow_button = findViewById<Button>(R.id.yellow_button)
        green_button = findViewById<Button>(R.id.green_button)

        setListeners()
    }

    private fun setListeners() {


        val clickabeViews: List<View> =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                constraint_layout,
                red_button,
                yellow_button,
                green_button
            )

        for (item in clickabeViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Button using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}