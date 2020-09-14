package com.example.github.homework

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {

    var arr = mutableSetOf(User("a","a","a","a"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
    fun signIn(view : View){
        for (item in arr){
            if (et_username.text.toString().equals(item.email))
               if (et_password.text.toString().equals(item.password)) {
                   startActivity(Intent(this,ProdoutListActivit::class.java).putExtra("Username",item.email))
               }else{
                   Toast.makeText(this,"passowrd is wrong",Toast.LENGTH_SHORT).show()
               }

        }
        Toast.makeText(this,"username is  ${et_username.text.toString()} password is ${et_password.text.toString()}",Toast.LENGTH_SHORT).show()
    }

    fun forgot(view : View){
        val email = Intent(Intent.ACTION_SEND)
        email.type = "message/rfc822"
        email.putExtra(Intent.EXTRA_EMAIL, arrayOf("info@skillgun.com"))
        email.putExtra(Intent.EXTRA_SUBJECT, "Hi, This is a test mail..")
        email.putExtra(Intent.EXTRA_TEXT, "Did you get this mail? if so please reply back")
        startActivity(Intent.createChooser(email, "Choose an Email Client"))
        Toast.makeText(this,"forgot",Toast.LENGTH_SHORT).show()
    }

    fun CreatAccount(view : View){
        startActivityForResult(Intent(this,CreatAccountAcityity::class.java),1)
        Toast.makeText(this,"creatAccoutn",Toast.LENGTH_SHORT).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            arr.add(data.getParcelableExtra<User>("user"))
        }

    }
}




