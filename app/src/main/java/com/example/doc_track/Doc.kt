package com.example.doc_track

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doc_track.docadp

class Doc : AppCompatActivity() {
    lateinit var docView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc)

        docView = findViewById(R.id.doctorView)

        var docList = ArrayList<datadoc>()

        docList.add(datadoc("Doc1","MBBS","ABC"))
        docList.add(datadoc("Doc2","MBBS","ABC"))
        docList.add(datadoc("Doc3","MBBS","ABC"))
        docList.add(datadoc("Doc4","MBBS","ABC"))
        docList.add(datadoc("Doc5","MBBS","ABC"))



        var adpater = docadp(docList)

        docView.adapter = adpater

        docView.layoutManager = LinearLayoutManager(this)
    }
}