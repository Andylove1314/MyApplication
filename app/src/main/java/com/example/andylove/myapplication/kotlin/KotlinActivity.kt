package com.example.andylove.myapplication.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.example.andylove.myapplication.R
import org.jetbrains.anko.*

/**
 * hello kotlin & anko DSL
 *
 */
class KotlinActivity : AppCompatActivity() {

    var a : String = "hello kotlin & anko DSL"

    var hello : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAnkoContentView()
        hello!!.text = a
        hello!!.textColor = getColor(R.color.colorAccent)
    }

    /**
     * 设置布局
     */
    private fun setAnkoContentView() {
        verticalLayout() {
            //textView
            hello = textView("text view") {
                textSize = 25f
            }.lparams {
                width = matchParent
                height = wrapContent
            }
            //button
            button("button").lparams {
                width = matchParent
                height = wrapContent
                topMargin = dip(20)
            }.setOnClickListener {
                Toast.makeText(context, hello!!.text.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }
}
