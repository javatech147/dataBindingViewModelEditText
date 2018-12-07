package com.waytojava.databindingedittextviewmodel

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * Created by Manish Kumar on 12/7/2018
 */

fun Context.log(message: String) {
    Log.d("TEST", message)
}

fun ViewModel.log(message: String) {
    Log.d("TEST", message)
}

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}