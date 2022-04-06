package com.example.android.demoapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

fun ImageView.imageFromUrl(url:String){


    Glide.with(this.context).load(url).into(this)
}