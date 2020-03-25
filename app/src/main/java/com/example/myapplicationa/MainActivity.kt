package com.example.myapplicationa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun a(v: View){
        var g: Excercise = Excercise("name", 3f, 2f)
        var next: Intent = Intent(this, Main2Activity::class.java)
        next.putExtra("a", g)
        startActivity(next)
    }
}

