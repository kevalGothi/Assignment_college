package com.example.assignment_college

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class Assignment4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment4)

        val colorRadioGroup = findViewById<RadioGroup>(R.id.colorRadioGroup)
        val colorDisplayLayout = findViewById<LinearLayout>(R.id.colorDisplayLayout)

        colorRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            val color = when (radioButton.text.toString()) {
                "Red" -> Color.RED
                "Blue" -> Color.BLUE
                "Green" -> Color.GREEN
                "Yellow" -> Color.YELLOW
                "Orange" -> Color.parseColor("#FFA500")
                else -> Color.BLACK
            }
            colorDisplayLayout.setBackgroundColor(color)
        }
    }
}
