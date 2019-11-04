package com.example.authgoskate.ui


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.authgoskate.R
import com.example.authgoskate.viewmodels.AuthViewModel
import com.example.contentgoskate.menuContent.MenuContainer
import kotlinx.android.synthetic.main.newuser.*


class NewUser : AppCompatActivity() {


    private val authViewModel by lazy { AuthViewModel(application) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newuser)

        /**
         * Valida campos para realizar el registro
         */

        btnNewusers.setOnClickListener {

            var name = nameRegis.text.toString().trim()
            var email = emailNew.text.toString().trim()
            var password = passNewU.text.toString().trim()
            var gendeer = "f"
            var age = ageUser.text.toString().trim()

            if(name.isNullOrEmpty() || email.isNullOrEmpty() || password.isNullOrEmpty()|| gendeer.isNullOrEmpty() || age.isNullOrEmpty()){
                Toast.makeText(this.applicationContext, "FALTAN DATOS", Toast.LENGTH_LONG).show()
            }else{
                authViewModel.registrerData(name, email ,password , gendeer ,age)
                Toast.makeText(this.applicationContext, "EXITO", Toast.LENGTH_LONG).show()
            }
        }

        btnNewusers.setOnClickListener {
           startActivity(Intent(this, MenuContainer::class.java))
        }



    }





}