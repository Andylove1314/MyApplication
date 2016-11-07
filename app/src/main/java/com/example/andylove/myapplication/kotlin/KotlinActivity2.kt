package com.example.andylove.myapplication.kotlin

import android.os.Bundle
import com.example.andylove.myapplication.KolinBaseActivity
import com.example.andylove.myapplication.R

class KotlinActivity2 : KolinBaseActivity() {
    override fun setAnkoContentView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)
    }
}
