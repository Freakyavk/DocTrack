package com.example.doc_track

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class Home : AppCompatActivity() {
    lateinit var hospitalList: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        hospitalList = findViewById(R.id.HosList)

        var hospital = ArrayList<String>()

        hospital.add("Sri Ramachandra Hospital")
        hospital.add("H2")
        hospital.add("H3")
        hospital.add("H4")
        hospital.add("H5")

        var hospAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,hospital)

        hospitalList.adapter = hospAdapter

        hospitalList.setOnItemClickListener(object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var intent = Intent(this@Home,Dis::class.java)
                intent.putExtra("HospitalName",hospAdapter.getItem(p2).toString())
                startActivity(intent)
            }

        })
    }
}