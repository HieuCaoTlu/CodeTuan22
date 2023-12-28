package com.example.codetuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivitySum : AppCompatActivity() {
    private var txt1: EditText? = null
    private var txt2: EditText? = null
    private var btn: Button? = null
    private var change: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sum)
        supportActionBar?.hide()
        txt1 = findViewById(R.id.SoDauTien)
        txt2 = findViewById(R.id.SoThuHai)
        btn = findViewById(R.id.ButtonSum)
        change = findViewById(R.id.GoToListActivity)

        btn!!.setOnClickListener(View.OnClickListener {
            val i = Intent(this, MainActivityResult::class.java)
            i.putExtra("a", txt1!!.text.toString())
            i.putExtra("b", txt2!!.text.toString())
            startActivity(i)
        })

        change!!.setOnClickListener(View.OnClickListener {
            val i2 = Intent(this, MainActivityList::class.java)
            startActivity(i2)
        })
    }
}

