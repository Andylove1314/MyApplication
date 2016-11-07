package com.example.andylove.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class KolinBaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAnkoContentView()
    }

    abstract fun setAnkoContentView()
}
