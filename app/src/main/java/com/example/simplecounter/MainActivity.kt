package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter=0
        val button = findViewById<ImageButton>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val upgradeButton = findViewById<Button>(R.id.button2)
        upgradeButton.visibility = View.INVISIBLE
        button.setOnClickListener {
            // Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()

            if (counter >= 100) {

                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener  {
                    textView2.text = "2+"

                    // Update original button to add 2 instead of `
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }

                    upgradeButton.visibility = View.INVISIBLE
                }
            }
        }








































    }
}