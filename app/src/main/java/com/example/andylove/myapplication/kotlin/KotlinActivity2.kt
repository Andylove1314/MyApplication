package com.example.andylove.myapplication.kotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.andylove.myapplication.KolinBaseActivity
import com.example.andylove.myapplication.R
import org.jetbrains.anko.find

class KotlinActivity2 : KolinBaseActivity() {

    var hello: TextView? = null
    var model: Model? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)
        hello = find<TextView>(R.id.textView6)
        model = Model()
        model?.name = "骚涛子，浪贵子，傻田子，二国子"
        hello?.text = model?.name

        for (x in 1..5) {
            Log.i("kotlin", "$x")
        }
        foo()
        Log.i("kotlin", transform(0))

        swith(1)

    }

    /**
     * swith
     */
    private fun swith(i:Int) {
        when (i) {
            1 -> print(1)
            2 -> print(2)
            else ->{
                print("fuck notfind")
            }
        }
    }

    /**
     * foo
     */
    private fun foo(s: String = "123", def: String = "456") {
        Log.i("kotlin", s + def)
    }

    fun foo2(param: Int) {

        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
    }

    fun transform(color: Int): String {
        return when (color) {
            0 -> "Red"
            1 -> "Green"
            2 -> "Blue"
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }

    override fun setAnkoContentView() {
    }
}
