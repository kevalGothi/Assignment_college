package com.example.assignment_college

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class assignment_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment6)

        val img=findViewById<ImageView>(R.id.img)
        val tv=findViewById<TextView>(R.id.textView8)


// Retrive Data from intent
        val itemName = intent.getStringExtra("IMAGE")

        if (itemName=="lion") {
            img.setImageResource(R.drawable.lion)
            tv.text = "This is lion the king of jungle"
        }
        else if(itemName == "tiger") {
            img.setImageResource(R.drawable.tiger)
            tv.text = "This is tiger"
        }
        else if(itemName == "elephant") {
            img.setImageResource(R.drawable.elephant)
            tv.text = "This is elephant"
        }
        else if(itemName == "dog") {
            img.setImageResource(R.drawable.dog)
            tv.text = "This is dog"
        }
        else if(itemName == "monkey") {
            img.setImageResource(R.drawable.monkey)
            tv.text = "This is monkey"
        }



    }
}