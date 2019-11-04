package com.example.contentgoskate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contentgoskate.R
import com.example.viewvalueobject.PostVO

class PostAdapter (val postList: List<PostVO>) : RecyclerView.Adapter<PostAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_post , parent , false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return postList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user : PostVO = postList[position]
        holder.textName.text = user.nameRader
        holder.textName.text = user.placerSpot
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val textName = itemView.findViewById(R.id.nameRader) as TextView
        val textPlace = itemView.findViewById(R.id.place) as TextView
    }



}