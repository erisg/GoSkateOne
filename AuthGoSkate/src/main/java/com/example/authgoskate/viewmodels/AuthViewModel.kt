package com.example.authgoskate.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.repositorygoskate.AuthRepository


class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val authRepository = AuthRepository(application)

    /***
     * Funcion que trae info del registro de usuario y la envia a el repository
     * @author : Geral
     * @version : 18/09/2019
     */

    fun registrerData(name: String, email: String, password: String, gendeer: String, age: String) {
        this.authRepository.registrerData(name, email, password, gendeer, age)
    }


    /**
     * Funcion que trae info del Login de usuario y la envia a el repository
     * @author : Geral
     * @version : 22/09/2019
     */

    fun infoLoginUser(email: String, password: String) {
        this.authRepository.lgoginUser(email, password)
    }

}

