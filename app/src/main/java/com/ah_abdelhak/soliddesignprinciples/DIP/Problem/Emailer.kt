package com.ah_abdelhak.soliddesignprinciples.DIP.Problem

/*
 * Class called Emailer to send email alerts
 */
class Emailer {
    fun generateJobAlert(job: String): String {
        return "You are alerted for $job"
    }
}