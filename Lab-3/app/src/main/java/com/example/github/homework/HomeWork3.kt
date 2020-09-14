package com.example.github.homework

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_homework.*
import kotlinx.android.synthetic.main.table_item.*
import kotlinx.android.synthetic.main.table_item.view.*


/**
 *   Created by zhangziyi on 9/2/20 11:40
 */
class HomeWork3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

    }

    fun addTable(view : View) {
        val layout: View = LayoutInflater.from(applicationContext)
            .inflate(R.layout.table_item, null) //布局打气筒获取单行对象
        layout.tx_version.text = et_version.text.toString()
        layout.tx_code.text = et_code.text.toString()
        tab_layout.addView(layout)
    }
}