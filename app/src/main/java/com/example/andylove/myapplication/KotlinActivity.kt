package com.example.andylove.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class KotlinActivity : AppCompatActivity() {

    var hello : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        hello = findViewById(R.id.textView5) as TextView?
        hello!!.textSize = 36.0f
    }
}
