package com.ah_abdelhak.soliddesignprinciples.DIP.Problem

/*
 * Class called Phone to send phone alerts
 */
class Phone {
    fun generateJobAlert(job: String): String {
        return "You are alerted for $job"
    }
}