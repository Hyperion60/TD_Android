package com.example.td_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.set
import com.example.td_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.incNb.text.clear()
        binding.incNb.text.insert(0, "1")
    }

    override fun onStart() {
        super.onStart()
        binding.incBtn.setOnClickListener {
            var value = binding.incNb.text.toString()
            var int_value = value.toInt()
            int_value += 1
            value = String.format("%d", int_value)
            binding.incNb.text.clear()
            binding.incNb.text.insert(0, value)
        }
    }
}