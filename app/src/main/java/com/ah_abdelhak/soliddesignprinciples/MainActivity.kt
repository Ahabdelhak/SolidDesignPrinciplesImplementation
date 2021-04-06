package com.ah_abdelhak.soliddesignprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ah_abdelhak.soliddesignprinciples.OpenClosed.Mercedes
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

        /*
        *Function referring to open/Closed Interface that show OpenClosed Principle
        * open/Closed >> Software entities such as classes, functions, modules should be open for extension but not modification
        * */
        geCarBrand()
    }

    private fun isEmailValidSRP(){
        Log.e(TAG,"SRP_getEmailValidation() -> isEmailValid: " + EmailValidation.isEmailValid("ahmed_SRP@outlook.com"))
    }
    private fun geCarBrand(){
        var m: Mercedes? = null
        Log.e(TAG,"OpenClosed_getBrand() -> Brand Is: " + m.toString())

    }

}