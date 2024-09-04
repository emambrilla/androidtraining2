package com.iesam.androidtraining2.features.login.data

import android.util.Log

class LoginMockRemoteDataSource {
    private val username = "android"
    private val password = "12345"

    fun validate( userName: String, password: String): Boolean{
        Log.d( "Validacion", userName)
        Log.d( "Validacion", password)
        return ((this.username == username) && (this.password == password))
    }
}