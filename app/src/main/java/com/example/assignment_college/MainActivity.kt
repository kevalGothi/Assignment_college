package com.example.assignment_college

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val assignment1=findViewById<Button>(R.id.button1)
        val assignment2=findViewById<Button>(R.id.button2)
        val assignment3=findViewById<Button>(R.id.button3)
        val assignment4=findViewById<Button>(R.id.button4)
        val assignment5=findViewById<Button>(R.id.button5)

        assignment1.setOnClickListener(){
            val i = Intent(this, Assignment1::class.java)
            startActivity(i)
        }
        assignment2.setOnClickListener(){
            val i = Intent(this, Assignment2::class.java)
            startActivity(i)
        }
        assignment3.setOnClickListener(){
            val i = Intent(this, Assignment3::class.java)
            startActivity(i)
        }
        assignment4.setOnClickListener(){
            val i = Intent(this, Assignment4::class.java)
            startActivity(i)
        }
        assignment5.setOnClickListener(){
            val i = Intent(this, Assignment5::class.java)
            startActivity(i)
        }
    }
}