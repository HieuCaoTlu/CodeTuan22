package com.example.codetuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityResult : AppCompatActivity() {
    private var result:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_appear_text)
        supportActionBar?.hide()
        result = findViewById(R.id.HienThiKetQua)

        val i1 = intent
        val a = i1.extras!!.getString("a")!!.toFloat()
        val b = i1.extras!!.getString("b")!!.toFloat()
        val tong = a + b
        result!!.text = tong.toString()
    }
}