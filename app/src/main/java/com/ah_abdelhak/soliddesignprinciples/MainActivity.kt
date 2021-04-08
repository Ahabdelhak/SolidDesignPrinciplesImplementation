package com.ah_abdelhak.soliddesignprinciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ah_abdelhak.soliddesignprinciples.DIP.Solution.BestJobTracker
import com.ah_abdelhak.soliddesignprinciples.ISP.IFax
import com.ah_abdelhak.soliddesignprinciples.ISP.IPrinter
import com.ah_abdelhak.soliddesignprinciples.ISP.IScanner
import com.ah_abdelhak.soliddesignprinciples.LSP.BirdCanFly
import com.ah_abdelhak.soliddesignprinciples.OpenClosed.Mercedes
import com.ah_abdelhak.soliddesignprinciples.SRP.EmailValidation

/*
* Show Implementation of S.O.L.I.D Design Principles
* */
class MainActivity : AppCompatActivity() , IPrinter, IFax, IScanner{
    val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*1
        *This function referring to Email Validation class that show SRP Implementation
        * SRP >> one class only have one responsibility
        * */
        isEmailValidSRP()

        /*2
        *Function referring to Car Interface that show OpenClosed Principle
        * open/Closed >> Software entities such as classes, functions, modules should be open for extension but not modification
        * */
        geCarBrand()

        /*3
        *Function referring to birdFly that show Liskov substitution Principle
        * LSP >> objects of the same superclass should be able to substitute each other without breaking existing code.
        * */
        geBirdFly()

        /*5
       *Function referring to JobTrackingCondition that show DIP Principle
       * DIP >> higher level modules in a program must not be tightly coupled with the lower-level modules.
       *        Both modules must depend on abstractions. This principle provides a mechanism to build loosely coupled software modules.
       * High-level modules should not depend on low-level modules. Both should depend on abstractions.
       *Abstractions should not depend upon details. Details should depend upon abstractions.
       * */
        getJobTrackingCondition()

    }

    private fun isEmailValidSRP(){
        Log.e(TAG,"SRP_getEmailValidation() -> isEmailValid: " + EmailValidation.isEmailValid("ahmed_SRP@outlook.com"))
    }
    private fun geCarBrand(){
        var mMercedes: Mercedes? = null
        Log.e(TAG,"OpenClosed_getBrand() -> Brand Is: " + mMercedes.toString())

    }
    private fun geBirdFly(){
        var mBirdFly: BirdCanFly? = null
        Log.e(TAG,"OpenClosed_getBrand() -> Brand Is: " + mBirdFly?.fly())
    }

    /*4
    *separated overridden function to show ISP Principle Implementation
    * ISP >> If an interface grows too big with mixed functionality, it makes sense to segregate it into multiple smaller interfaces.
    * */
    override fun Print() {
        Log.e(TAG,"ISP_Print() -> Printing: ")
    }
    override fun Fax() {
        Log.e(TAG,"ISP_Fax() -> Fax: ")
    }
    override fun Scan() {
        Log.e(TAG,"ISP_Scan() -> Scanning: ")
    }

    private fun getJobTrackingCondition() {
        var mBestJobTracker: BestJobTracker? = null
        mBestJobTracker?.setCurrentConditions("urgent")
    }
}