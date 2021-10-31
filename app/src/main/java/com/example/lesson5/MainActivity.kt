package com.example.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
val build=ActivityMainBinding.inflate(layoutInflater)
        setContentView(build.root)

        build.first.apply {
            setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.purple_700))
            }
        }

                build.second.apply {
            setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.black))
            }
        }

        build.third.apply {
            setOnClickListener {
                build.mainText.setTextColor(getColor(R.color.teal_700))
            }
        }

    }
}