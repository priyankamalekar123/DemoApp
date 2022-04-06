package com.example.android.demoapp

import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val factLiveData = MutableLiveData<String>("Hello LiveData")

    fun updateText(){
        factLiveData.value = " Hello MutableLiveData"
    }
  //for Integer......
    var count1 = MutableLiveData<Int>(0)
    var count =0
    fun increment(){
        count++
        count1.value = count
    }

  //Data binding for LiveData

    val  Databinding  = MutableLiveData<String>(" Data Binding")

    fun updateText1(){
        Databinding.value = " Data Binding Successfully Done"
    }

//    var count:Int=0
//
//    fun increment(){
//        count++
//    }





}