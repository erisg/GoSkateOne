package com.example.contentgoskate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.homefragment.*
import kotlinx.android.synthetic.main.post.*

class Post : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.post, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        validatePost()
    }


    /**
     *  Valida campos para enviar publicacion al servicio
     */


    fun validatePost() {
        val namePost = namePost.text.toString()
        val placePost = parche.text.toString()

        if (namePost.isNullOrEmpty()) {
            Toast.makeText(this.context, "DEBES INGRESAR NOMBRE DEL RIDER", Toast.LENGTH_LONG)
        } else if (placePost.isNullOrEmpty()) {
            Toast.makeText(this.context, "INGRESAR HUBICACION DEL PARCHE", Toast.LENGTH_LONG).show()
        } else {
      //      authViewModel.infoLoginUser(namePost, placePost)
        }
    }
}