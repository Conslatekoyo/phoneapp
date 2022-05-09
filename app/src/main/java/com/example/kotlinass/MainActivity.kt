package com.example.kotlinass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI:Button
    lateinit var btnsendmoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI=findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent =Intent(this,bmiCalculator::class.java)
            startActivity(intent)
        }
        btnsendmoney=findViewById(R.id.btnsendmoney)
        btnsendmoney.setOnClickListener {
            val intent=Intent(this,btnsendmoney::class.java)
            startActivity(intent)
        }
    }
}