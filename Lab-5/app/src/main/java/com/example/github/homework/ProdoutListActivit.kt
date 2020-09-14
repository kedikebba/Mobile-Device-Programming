package com.example.github.homework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_productlist.*

/**
 *   Created by zhangziyi on 9/3/20 12:46
 */
class ProdoutListActivit : AppCompatActivity(){

    var list= mutableListOf<Product>()
    var adapter = MyAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productlist)
        for (i in 0..3){
            list.add(Product("is number ${i} product", R.mipmap.dd_logo))
        }

        testWithStaggerLayoutManger();
    }

    fun  testWithStaggerLayoutManger(){
        rv_prolist.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        rv_prolist.adapter = adapter
        adapter.setList(list)
    }

}

