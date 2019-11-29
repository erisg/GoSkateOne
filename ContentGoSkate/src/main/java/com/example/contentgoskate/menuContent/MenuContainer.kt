package com.example.contentgoskate.menuContent

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
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

        toolbar.title = "GO SKATE"

        setupBottonNavMenu()
    }


    private fun setupBottonNavMenu(){
        nav_bottom?.setOnNavigationItemSelectedListener{
                menuItem ->
             when(menuItem.itemId) {
                 R.id.home_nav ->{
                     val fragment = HomeFragment.newInstance()
                     openFragment(fragment)
                     true
                 }R.id.map_nav ->{
                 true
             }R.id.shop_nav ->{
                 val fragment = ShopFragment.newInstance()
                 openFragment(fragment)
                 true
             }
                 else -> false
             }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.nav_fragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}