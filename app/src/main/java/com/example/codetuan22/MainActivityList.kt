package com.example.codetuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import com.example.codetuan22.list_fragment.ItemOfAdapter
import com.example.codetuan22.list_fragment.ItemOfList

class MainActivityList : AppCompatActivity() {
    private var adap:ItemOfAdapter? = null
    private var ls:ArrayList<ItemOfList> = ArrayList()
    private var change:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)
        val lv = findViewById<ListView>(R.id.ListViewAttend)
        change = findViewById(R.id.GoToSumActivity)

        // Tạo nguồn dữ liệu
        ls.add(ItemOfList("Peter Johnson", "Thực tập sinh", R.drawable.man))
        ls.add(ItemOfList("Maria Carey", "Phó ban Marketing", R.drawable.woman))
        ls.add(ItemOfList("Harmony Emily", "Trưởng ban Marketing", R.drawable.woman2))
        ls.add(ItemOfList("Joe Amilson", "Giám đốc tài chính", R.drawable.man2))
        ls.add(ItemOfList("Hellen Nobel", "Bác sĩ gia đình", R.drawable.woman3))
        ls.add(ItemOfList("Santa Claus", "Ông già Noel", R.drawable.man3))
        ls.add(ItemOfList("Morning Kardashian", "Trợ lý giám đốc", R.drawable.woman4))

        // Gán vào Adapter
        adap = ItemOfAdapter(this, ls)
        lv.adapter = adap

        change!!.setOnClickListener(View.OnClickListener {
            val i = Intent(this, MainActivitySum::class.java)
            startActivity(i)
        })
    }
}