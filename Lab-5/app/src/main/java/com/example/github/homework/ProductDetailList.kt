package com.example.github.homework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_productlist.*

class ProductDetailList : AppCompatActivity(){
    var list= mutableListOf<Product>()
    var adapter = ProductDetialAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetaillist)
        for (i in 0..10){
            list.add(Product("it product ${i}",R.mipmap.dd_logo))
        }
        StaggerLayoutManger();
    }

    fun  StaggerLayoutManger(){
        rv_prolist.layoutManager = LinearLayoutManager(this)
        rv_prolist.adapter = adapter
        adapter.setList(list)
    }

}