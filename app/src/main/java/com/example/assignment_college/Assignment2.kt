package com.example.assignment_college

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment_college.databinding.ActivityAssignment2Binding
import com.example.assignment_college.databinding.ActivityMainBinding

class Assignment2 : AppCompatActivity() {
    private lateinit var binding: ActivityAssignment2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAssignment2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.unit_array,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.unitSpinner.adapter = adapter

        binding.convertButton.setOnClickListener {
            val feetValue = binding.feetEditText.text.toString().toDoubleOrNull()
            if (feetValue != null) {
                val selectedItem = binding.unitSpinner.selectedItem.toString()
                val result = when (selectedItem) {
                    "Meter" -> feetValue * 0.3048 // Convert feet to meters
                    "Kilometer" -> feetValue * 0.0003048 // Convert feet to kilometers
                    else -> 0.0
                }
                binding.resultTextView.text = result.toString()
            } else {
                binding.resultTextView.text = "Please enter a valid feet value"
            }
        }
    }
}
