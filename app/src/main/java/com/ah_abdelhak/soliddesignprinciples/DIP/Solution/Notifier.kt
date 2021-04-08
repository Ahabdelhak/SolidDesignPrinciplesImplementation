package com.ah_abdelhak.soliddesignprinciples.DIP.Solution

/*
 * Solution step 1: Create an interface called Notifier.
 * It has one method: jobAlert(String jobDescription);
 */
interface Notifier {
    fun jobAlert(jobDescription: String?)
}