package com.waytojava.databindingedittextviewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

/**
 * Created by Manish Kumar on 12/7/2018
 */

class MainViewModel : ViewModel() {
    var email = ObservableField<String>("Manish Kumar")
    var password = ObservableField<String>("")  // Default initialization is mandatory


    var enableEmail = ObservableField<Boolean>()    // default is false
    var enablePassword = ObservableField<Boolean>() //
    var enableLoginButton = ObservableField<Boolean>()
    var enableEditButton = ObservableField<Boolean>(true)

    var selectionEmail = ObservableField<Int>()
    var selectionPassword = ObservableField<Int>()

    fun edit() {
        enableLoginButton.set(true)
        enableEmail.set(true)
        enablePassword.set(true)
        enableEditButton.set(false)

        selectionEmail.set(email.get()!!.length)
        selectionPassword.set(password.get()!!.length)

    }

    fun login() {
        log("Email is : ${email.get()} And password is : ${password.get()}")
    }
}