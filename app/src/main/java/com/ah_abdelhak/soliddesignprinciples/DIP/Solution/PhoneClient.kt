package com.ah_abdelhak.soliddesignprinciples.DIP.Solution

/*
 * Step III:
 * Create an PhoneClient class that implements
 * Notifier interface
 */
class PhoneClient : Notifier {
    override fun jobAlert(jobDescription: String?) {
        if (jobDescription === "urgent");
        print("Job description is urgent")
    }
}