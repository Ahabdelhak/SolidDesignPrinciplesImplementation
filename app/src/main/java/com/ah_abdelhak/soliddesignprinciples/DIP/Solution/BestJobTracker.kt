package com.ah_abdelhak.soliddesignprinciples.DIP.Solution

/*
 * Step IV: The JobTracker class would just
 * call the respective notifiers. It does not
 * handle any logic
 */
class BestJobTracker {
    private var currentAlert: String? = null
    fun setCurrentConditions(jobDescription: String?) {
        currentAlert = jobDescription
    }

    fun notify(notifier: Notifier) {
        notifier.jobAlert(currentAlert)
    }
}