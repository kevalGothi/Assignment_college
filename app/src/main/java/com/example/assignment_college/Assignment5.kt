package com.example.assignment_college

import android.os.Bundle
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Assignment5 : AppCompatActivity() {

    private val selectedItems = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment5)

        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val selectedItemsLayout = findViewById<LinearLayout>(R.id.selectedItemsLayout)

        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            updateSelectedItems("Ram", isChecked)
            updateSelectedItemsList(selectedItemsLayout)
        }

        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            updateSelectedItems("Syam", isChecked)
            updateSelectedItemsList(selectedItemsLayout)
        }

        checkBox3.setOnCheckedChangeListener { _, isChecked ->
            updateSelectedItems("GhanSyam", isChecked)
            updateSelectedItemsList(selectedItemsLayout)
        }
    }

    private fun updateSelectedItems(item: String, isChecked: Boolean) {
        if (isChecked) {
            if (!selectedItems.contains(item)) {
                selectedItems.add(item)
            }
        } else {
            selectedItems.remove(item)
        }
    }

    private fun updateSelectedItemsList(layout: LinearLayout) {
        layout.removeAllViews()
        selectedItems.forEach { item ->
            val textView = TextView(this)
            textView.text = item
            layout.addView(textView)
        }
    }
}
