package com.example.doc_track

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dis : AppCompatActivity() {
    lateinit var disView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dis)

        disView = findViewById(R.id.disView)

        var disList = ArrayList<datadis>()

        disList.add(datadis("Diabities"))
        disList.add(datadis("BP"))
        disList.add(datadis("TB"))
        disList.add(datadis("Corona"))
        disList.add(datadis("Typhoid"))



        var adpater = disadp(disList,this@Dis)

        disView.adapter = adpater

        disView.layoutManager = LinearLayoutManager(this)
    }
}