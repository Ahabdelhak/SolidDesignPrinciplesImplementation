package com.ah_abdelhak.soliddesignprinciples.DIP.Solution

/*
 * Step II:
 * Create an emailClient class that implements
 * Notifier interface
 */
class EmailClient : Notifier {
    override fun jobAlert(jobDescription: String?) {
        if (jobDescription === "brief");
        print("Job description is brief")
    }
}