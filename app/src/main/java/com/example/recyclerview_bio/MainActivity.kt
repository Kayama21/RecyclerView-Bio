package com.example.recyclerview_bio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listVM = DataViewModel()
        val rvList = findViewById<RecyclerView>(R.id.rv_data)
        val adapter = DataAdapter(listVM.dataList())

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

    }
}