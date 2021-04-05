package com.ah_abdelhak.soliddesignprinciples.SRP

import android.app.Dialog
import java.util.regex.Matcher
import java.util.regex.Pattern

class EmailValidation {
    companion object {
        val emailValidation: EmailValidation? = null

        fun isEmailValid(email: String): Boolean {
            var isValid = false
            val expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
            val inputStr: CharSequence = email
            val pattern: Pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE)
            val matcher: Matcher = pattern.matcher(inputStr)
            if (matcher.matches()) {
                isValid = true
            }
            return isValid
        }
    }
}