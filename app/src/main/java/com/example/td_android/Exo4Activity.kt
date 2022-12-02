package com.example.td_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.td_android.databinding.ActivityExo4Binding

class Exo4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityExo4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExo4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val text = intent.extras?.getString("text")
        binding.userText.text = text
    }


    override fun onStart() {
        super.onStart()
    }
}