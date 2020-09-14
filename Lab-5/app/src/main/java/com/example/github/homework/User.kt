package com.example.github.homework

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 *   Created by zhangziyi on 9/3/20 11:45
 */
@Parcelize
data class User( var first_name: String,var  last_name : String ,var email:String,var password : String ) :
    Parcelable