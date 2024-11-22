package com.sanjivani.assignment4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0 // Counter variable to keep track of button clicks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Finding the TextView and Buttons by their IDs
        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Button 1: Increment counter and display the result in the TextView
        button1.setOnClickListener {
            counter++  // Increment the counter
            textView.text = "Counter: $counter"  // Update the TextView with the new counter value
        }

        // Button 2: Change TextView height
        button2.setOnClickListener {
            // Toggle between two height values (200dp and 400dp)
            val newHeight = if (textView.height == 200) 400 else 200
            val layoutParams = textView.layoutParams
            layoutParams.height = newHeight  // Set the new height
            textView.layoutParams = layoutParams  // Apply the layout parameters to the TextView
        }

        // Button 3: Center the TextView's text on the screen
        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER  // Change the gravity to center the text
        }
    }
}
