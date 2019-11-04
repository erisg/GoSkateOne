package com.example.contentgoskate.menuContent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.contentgoskate.R


class HomeFragment : Fragment() {

    var navController : NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.homefragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.addPost).setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_home_nav_to_post2)
        }

    }

//    override fun onClick(v: View?) {
//        when(v!!.id){
//            R.id.addPost -> navController!!.navigate(R.id.action_home_nav_to_post2)
//        }
//    }
}



