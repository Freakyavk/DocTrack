package com.example.doc_track

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doc_track.R
import com.example.doc_track.datadoc

class docadp(var docDetail: ArrayList<datadoc>):RecyclerView.Adapter<docadp.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        lateinit var docName:TextView
        lateinit var docDegree:TextView
        lateinit var docSpecialist:TextView

        init {
            docName = view.findViewById(R.id.doctorName)
            docDegree = view.findViewById(R.id.doctorDegeree)
            docSpecialist = view.findViewById(R.id.doctorSpecialist)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var a  = LayoutInflater.from(parent.context).inflate(R.layout.docdetails,parent,false)
        return ViewHolder(a)

    }

    override fun getItemCount(): Int {

        return docDetail.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.docName.text = docDetail[position].Name
        holder.docDegree.text = docDetail[position].Degree
        holder.docSpecialist.text = docDetail[position].Specialist
    }
}