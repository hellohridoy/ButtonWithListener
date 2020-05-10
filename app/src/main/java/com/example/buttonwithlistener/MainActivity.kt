package com.example.buttonwithlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add listener with the button
        buttonId.setOnClickListener {
            Toast.makeText(applicationContext,"Button was clicked",Toast.LENGTH_LONG).show()
        }
    }
}
