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
    //常量
    val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)
        hello = find<TextView>(R.id.textView6)
        model = Model()
        model?.name = SUBSYSTEM_DEPRECATED
        hello?.text = model?.name

        for (x in 1..5) {
            Log.i("kotlin", "$x")
        }

        foo()

        Log.i("kotlin", transform(0))

        swith(1)

        for (i in 1..100) {
            for (j in 20..100) {
                if (i == j)
                    Log.i("kotlin", "break_" + "$i")
                break
            }
        }
        Log.i("kotlin", Customer("asdfg").customerKey)

        DontCreateMe("asdf").getName()

        C().caller(D())

        var box: Box<String> = Box("ffff")

        Log.i("kotlin", box.value)
        MyClass.create()?.name = "singleton"

    }

    class MyClass {

        var name : String? = null

        companion object Factory {
            fun create(): MyClass = MyClass()
        }
    }

    fun ori(ori: Direction) {
        when (ori) {
            Direction.EAST -> print("东")
            Direction.SOUTH -> print("南")
            Direction.WEST -> print("西")
            Direction.NORTH -> print("北")
            else ->
                print("未知")
        }
    }

    enum class Direction { NORTH, SOUTH, WEST, EAST }

    enum class Color(val rgb: Int) {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
    }

    enum class ProtocolState {
        WAITING {
            override fun signal() = TALKING
        },
        TALKING {
            override fun signal() = WAITING
        };

        abstract fun signal(): ProtocolState
    }

    class Box<T>(t: T) {
        var value = t
    }

    /**
     * 内部类
     */
    open class Customer(name: String) : Any() {
        val customerKey = name.toUpperCase()
        fun getName(): String {
            return "fengkun"
        }

        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
    }

    class DontCreateMe(name: String) : Customer(name) {
        fun getAge(): String {
            return "andylove"
        }
    }

    open class Base {
        open fun f() {
        }
    }

    abstract class Derived : Base() {
        override abstract fun f()
    }

    /**
     * 接口
     */
    interface MyInterface {
        fun bar()
        fun foo() {
            // optional body
        }
    }

    /**
     * swith
     */
    private fun swith(i: Int) {
        when (i) {
            1 -> print(1)
            2 -> print(2)
            else -> {
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


    //空类D
    open class D

    //空类D1
    class D1 : D()

    open class C {

        open fun D.foo() {
            println("D.foo in C")
        }

        open fun D1.foo() {
            println("D1.foo in C")
        }

        fun caller(d: D) {
            d.foo()   // call the extension function    } }
            class C1 : C() {
                override fun D.foo() {
                    println("D.foo in C1")
                }

                override fun D1.foo() {
                    println("D1.foo in C1")
                }
            }

        }
    }

    data class User(val name: String = "", val age: Int = 0)


}
