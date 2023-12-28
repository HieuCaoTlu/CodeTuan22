package com.example.codetuan22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityResult : AppCompatActivity() {
    var result:TextView? = null
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_appear_text)
        supportActionBar?.hide()
        result = findViewById(R.id.HienThiKetQua)

        var i1 = intent
        val a = i1.extras!!.getString("a")!!.toFloat()
        val b = i1.extras!!.getString("b")!!.toFloat()
        val tong = a + b
        result!!.text = tong.toString()
    }
}