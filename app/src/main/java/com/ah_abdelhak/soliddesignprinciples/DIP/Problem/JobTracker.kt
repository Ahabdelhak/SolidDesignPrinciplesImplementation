package com.ah_abdelhak.soliddesignprinciples.DIP.Problem

/*
 * Class called JobTracker.
 * This class initializes both the Phone & Email class
 * This is a violation of the DIP principle
 */
class JobTracker {
    private val phone: Phone
    private val emailer: Emailer

    /*
     * Based on the jobDescription, the alert is sent
     * This logic should not be implemented here!
     */
    fun setCurrentConditions(jobDescription: String) {
        if (jobDescription === "urgent") {
            val alert = phone.generateJobAlert(jobDescription)
            print(alert)
        }
        if (jobDescription === "brief") {
            val alert = emailer.generateJobAlert(jobDescription)
            print(alert)
        }
    }

    init {
        phone = Phone()
        emailer = Emailer()
    }
}