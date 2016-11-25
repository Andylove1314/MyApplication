package com.example.andylove.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class KolinBaseActivity : AppCompatActivity() {
    val p: String by lazy{
        "lazy"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAnkoContentView()
        "Convert this to camelcase".spcaceToCamelCase()
    }

    /**
     * 扩展函数
     */
    fun String.spcaceToCamelCase(){
        print("去空格成功！")
        print("${spcaceToCamelCase()}")

    }

    abstract fun setAnkoContentView()

    fun cases(obj: Any) {
        when (obj) {
            1 -> print("one")
            "hello" -> print("Greeting")
            is Long -> print("Long")
            !is Long -> print("Not a string")
            else -> print("Unknown")
        }
    }
}
