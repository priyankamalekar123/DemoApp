package com.example.android.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.demoapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var textcounter: TextView
    lateinit var button1: Button

    lateinit var textcounter1: TextView
    lateinit var button2: Button

    lateinit var mainviewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        Log.i("MainActivity.this", "oncreate")

       // textcounter = findViewById(R.id.textView)
       // button1 = findViewById(R.id.button

//        val bottomNav = findViewById<BottomNavigationView>(R.id.naview)
//
//        val navController = findNavController(R.id.navfragment)
//
//        bottomNav.setupWithNavController(navController)


        textcounter1 = findViewById(R.id.textView2)
        button2 = findViewById(R.id.button2)

        mainviewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//      FOR String
        mainviewModel.factLiveData.observe(this, Observer {
            binding.textView.text = it
        })
        binding.button.setOnClickListener {
            mainviewModel.updateText()

        }

//      FOR Int
        mainviewModel.count1.observe(this, Observer {
            textcounter1.text = it.toString()
        })

        button2.setOnClickListener {
            mainviewModel.increment()
        }

//      FOR Data binding with livedata
//        mainviewModel.Databinding.observe(this, Observer {
//            binding.textView3.text = it
//        })

       binding.mainViewModel1 = mainviewModel
       binding.lifecycleOwner = this

//   FOR LiveData
    val post = Post("Hello Kotlin","https://en.wikipedia.org/wiki/Image#/media/File:Image_created_with_a_mobile_phone.png")
        binding.post1=post

    }

    override fun onStart() {
        super.onStart()

        Log.i("MainActivity.this", "onstart")

    }

    override fun onResume() {
        super.onResume()

        Log.i("MainActivity.this", "onresume")

    }

    override fun onPause() {
        super.onPause()

        Log.i("MainActivity.this", "onpause")

    }

    override fun onStop() {
        super.onStop()

        Log.i("MainActivity.this", "onstop")


    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("MainActivity.this", "ondestroy")

    }


}



