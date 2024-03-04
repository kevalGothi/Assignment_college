package com.example.assignment_college

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class Assignment1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment1)

        val lion:ImageView=findViewById(R.id.lion)
        val tiger:ImageView=findViewById(R.id.tiger)
        val elephant:ImageView=findViewById(R.id.elephant)
        val monkey:ImageView=findViewById(R.id.monkey)
        val dog:ImageView=findViewById(R.id.dog)


        lion.setOnClickListener(){
            Toast.makeText(this, "this is lion", Toast.LENGTH_SHORT).show()
        }
        tiger.setOnClickListener(){
            Toast.makeText(this, "this is tiger", Toast.LENGTH_SHORT).show()
        }
        elephant.setOnClickListener(){
            Toast.makeText(this, "this is elephant", Toast.LENGTH_SHORT).show()
        }
        monkey.setOnClickListener(){
            Toast.makeText(this, "this is monkey", Toast.LENGTH_SHORT).show()
        }
        dog.setOnClickListener(){
            Toast.makeText(this, "this is dog", Toast.LENGTH_SHORT).show()
        }
    }
}