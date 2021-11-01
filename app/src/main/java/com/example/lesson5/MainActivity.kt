package com.example.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val build = ActivityMainBinding.inflate(layoutInflater)
        setContentView(build.root)

        build.apply {
            first.setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.purple_700))
            }
            second.setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.black))
            }
            third.setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.teal_700))
            }
        }
    }
}