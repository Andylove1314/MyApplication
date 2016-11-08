package com.example.andylove.myapplication.kotlin

import android.os.Bundle
import android.widget.TextView
import com.example.andylove.myapplication.KolinBaseActivity
import com.example.andylove.myapplication.R
import org.jetbrains.anko.*

/**
 * hello kotlin & anko DSL
 *
 */
class KotlinActivity : KolinBaseActivity() {

    var a: String = "hello kotlin & anko DSL"
    var hello : TextView = null!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAnkoContentView()
    }

    override fun setAnkoContentView() {
        verticalLayout() {
            editText().hint = "sdas"
            //textView
            hello = textView("text view") {
                textSize = 25f
                text = a
                textColor = getColor(R.color.colorAccent)
            }.lparams {
                width = matchParent
                height = wrapContent
            }
            //button
            button("button") { onClick { ctx.toast(hello!!.text.toString()) } }.lparams {
                width = matchParent
                height = wrapContent
                topMargin = dip(20)

            }
        }
    }


}
