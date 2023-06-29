package com.example.doc_track

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class disadp(var disDetail: ArrayList<datadis>,context: Context):RecyclerView.Adapter<disadp.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        lateinit var disName:TextView
        lateinit var card:CardView

        init {
            disName = view.findViewById(R.id.disName)
            card = view.findViewById(R.id.parent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var a  = LayoutInflater.from(parent.context).inflate(R.layout.docdetails,parent,false)
        return ViewHolder(a)

    }

    override fun getItemCount(): Int {

        return disDetail.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.disName.text = disDetail[position].Name
        holder.card.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(holder.card.context, Doc::class.java)
                holder.card.context.startActivity(intent)
            }

        })
    }
}