package com.ah_abdelhak.soliddesignprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ah_abdelhak.soliddesignprinciples.SRP.EmailValidation

/*
* Show Implementation of S.O.L.I.D Design Principles
* */
class MainActivity : AppCompatActivity() {
    val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        *This function referring to Email Validation class that show SRP Implementation
        * SRP >> one class only have one responsibility
        * */
        isEmailValidSRP()
    }

    private fun isEmailValidSRP(){
        Log.e(TAG,"SRP_getEmailValidation() -> isEmailValid: " + EmailValidation.isEmailValid("ahmed_SRP@outlook.com"))
    }

}