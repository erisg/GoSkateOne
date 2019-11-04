package com.example.goskate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.example.contentgoskate.menuContent.MenuContainer

class MainActivity : AppCompatActivity() {

    private lateinit var  navControler : NavController

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val background = object : Thread(){
                override fun run() {
                    try {
                        Thread.sleep(7000)
                        val intent = Intent(baseContext, MenuContainer::class.java)
                        startActivity(intent)
                    }catch (e : Exception){
                        e.printStackTrace()
                    }
                }
            }

            background.start()

        }

}
