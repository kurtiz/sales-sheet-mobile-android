package com.papiliotechnologies.jenamsalessheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = this.resources.getColor(R.color.green)
    }
}