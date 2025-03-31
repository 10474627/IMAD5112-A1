package com.example.assignment1v3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views by their IDs
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnReset = findViewById<Button>(R.id.reset)  // Reset button
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)

        // Set OnClickListener for the Submit button
        btnSubmit.setOnClickListener {
            val userInput = editText.text.toString().lowercase(Locale.getDefault())  // Convert input to lowercase

            // Check if the input matches the expected values
            if (userInput == "morning") {
                textView.text = "Have some eggs, bacon, and toast"
            } else if (userInput == "mid-morning") {
                textView.text = "Have some toast and cheese"
            } else if (userInput == "afternoon") {
                textView.text = "Have a burger with a side of coffee"
            } else if (userInput == "mid-afternoon") {
                textView.text = "Grab some pizza"
            } else if (userInput == "dinner") {
                textView.text = "Time for some rice, grilled chicken, and Greek salad"
            } else if (userInput == "dessert") {
                textView.text = "I think Ice Cream and Custard is great"
            } else {
                textView.text = "Please type 'morning', 'mid-morning', 'afternoon', 'mid-afternoon', 'dinner' or 'dessert'"
            }
        }

        // Set OnClickListener for the Reset button
        btnReset.setOnClickListener {
            // Clear the EditText field when the Reset button is clicked
            editText.text.clear()

            // Optionally, reset the TextView as well
            textView.text = ""
        }
    }
}
