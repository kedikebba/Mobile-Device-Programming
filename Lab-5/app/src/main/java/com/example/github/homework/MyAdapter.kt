package com.example.github.homework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 *   Created by zhangziyi on 9/3/20 18:37
 */

class MyAdapter  : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var list: MutableList<Product>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_prodect, parent, false)
        val holder = MyViewHolder(itemView)
        return holder
    }

    override fun getItemCount(): Int {
       return 4
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.text?.text = list!![position].name
    }

    open fun setList( list : MutableList<Product>){
        this.list = list
        notifyDataSetChanged()
    }


    class MyViewHolder(itmeview : View) : RecyclerView.ViewHolder(itmeview) {
        var text: TextView = itemView!!.findViewById(R.id.item_text)
        var imageView: ImageView = itemView!!.findViewById(R.id.image_pro)
    }
}