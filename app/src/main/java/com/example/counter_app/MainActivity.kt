package com.example.counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)
//        val minusButton = findViewById<Button>(R.id.MinusButton)

        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
            Log.i("onClick", "리셋 된 숫자는 $number")
        }

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
            Log.i("onClick", "플러스 된 숫자는 $number")
        }

//        minusButton.setOnClickListener {
//            number -= 1
//            numberTextView.text = number.toString()
//            Log.i("onClick","마이너스 된 숫자는 $number")
//        }
    }

    override fun onResume() {
        super.onResume()
    }
}