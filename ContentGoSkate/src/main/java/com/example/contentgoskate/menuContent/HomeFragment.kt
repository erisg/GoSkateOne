package com.example.contentgoskate.menuContent

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.contentgoskate.Post
import com.example.contentgoskate.R
import kotlinx.android.synthetic.main.homefragment.*


class HomeFragment : Fragment() {
    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.homefragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addPost.setOnClickListener {initPost(addPost)}

    }

    fun initPost(button: Button){
        when(button){
            button->{
                startActivity(Intent(this.context, Post::class.java))
            }
        }
    }
}



