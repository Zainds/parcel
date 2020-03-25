package com.example.myapplicationa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var ag = intent.extras?.get("a") as Excercise
        a1.text = ag.name
        a2.text = ag.imbDownLimit.toString()
        a3.text = ag.imbLimit.toString()
    }
}
