package com.niven.st10134934_prog7313_ice_one

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val num1 = findViewById(R.id.EdTxtValOne) as EditText
        val num2 = findViewById(R.id.EdTxtValTwo) as EditText
        val tot = findViewById(R.id.txtValAns) as TextView

        val btnAdd = findViewById(R.id.btnAdd) as Button
        val btnSub = findViewById(R.id.btnSub) as Button
        val btnMul = findViewById(R.id.btnMul) as Button
        val btnDiv = findViewById(R.id.btnDiv) as Button
        

        btnAdd.setOnClickListener {

            val val1 = num1.text.toString()
            val val2 = num2.text.toString()

            if (val1.isBlank() || val2.isBlank())
            {
                tot.setText("Please enter valid numbers")
            }
            else
            {
                val val1 = num1.text.toString().toDouble()
                val val2 = num2.text.toString().toDouble()

                val result = val1 + val2;
                tot.setText("$val1 + $val2 = $result")
            }
        }

        btnSub.setOnClickListener {

            val val1 = num1.text.toString()
            val val2 = num2.text.toString()

            if (val1.isBlank() || val2.isBlank())
            {
                tot.setText("Please enter valid numbers")
            }
            else
            {
                val val1 = num1.text.toString().toDouble()
                val val2 = num2.text.toString().toDouble()

                val result = val1 - val2;
                tot.setText("$val1 - $val2 = $result")
            }
        }

        btnMul.setOnClickListener {

            val val1 = num1.text.toString()
            val val2 = num2.text.toString()

            if (val1.isBlank() || val2.isBlank())
            {
                tot.setText("Please enter valid numbers")
            }
            else
            {
                val val1 = num1.text.toString().toDouble()
                val val2 = num2.text.toString().toDouble()

                val result = val1 * val2;
                tot.setText("$val1 * $val2 = $result")
            }
        }

        btnDiv.setOnClickListener {

            val val1 = num1.text.toString()
            val val2 = num2.text.toString()

            if (val1.isBlank() || val2.isBlank())
            {
                tot.setText("Please enter valid numbers")
            }

            else{
                val val1 = num1.text.toString().toDouble()
                val val2 = num2.text.toString().toDouble()

                val result = val1/val2
                tot.setText("$val1 / $val2 = $result")

                if (val2==0.0){
                    tot.setText("Number cannot be divided by zero")
                }
            }


        }


    }
}

/*
Title: Kotlin Operators
Author: W3Schools
Date: 2025
Availability: https://www.w3schools.com/kotlin/kotlin_operators.php
*/