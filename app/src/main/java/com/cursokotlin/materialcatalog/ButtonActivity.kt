package com.cursokotlin.materialcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->
            // Acciones del toggle
        }
    }
}
