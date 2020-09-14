package com.example.github.homework

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginPage: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun signIn(view : View){
        Toast.makeText(this,"username is  ${et_username.text.toString()} password is ${et_password.text.toString()}",Toast.LENGTH_SHORT)
    }

    fun forgot(view : View){
        Toast.makeText(this,"forgot",Toast.LENGTH_SHORT)
    }

    fun CreatAccount(view : View){
        Toast.makeText(this,"creatAccoutn",Toast.LENGTH_SHORT)
    }

}