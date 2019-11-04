package com.example.contentgoskate.menuContent

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.contentgoskate.R
import kotlinx.android.synthetic.main.homefragment.*
import kotlinx.android.synthetic.main.menu_container.*

class MenuContainer : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_container)

        val navController = Navigation.findNavController(this,
            R.id.nav_fragment
        )
        toolbar.title = "GO SKATE"
        setupBottonNavMenu(navController)
    }


    private fun setupBottonNavMenu(navController: NavController){
        nav_bottom?.let {
            NavigationUI.setupWithNavController(it, navController)
        }
    }


}