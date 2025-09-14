package jp.techacademy.yasuo.nagaro.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human_say = Human("Yasuo", 39, "ダンス")
        val human_think = Human("Yasuo", 39, "ダンス")

        human_say.say()
        human_think.think()
    }
}