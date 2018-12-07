package com.waytojava.databindingedittextviewmodel

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.waytojava.databindingedittextviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        mainActivityBinding.viewModel = mainViewModel
    }
}
