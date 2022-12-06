package com.example.td_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.td_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Exo 3
        binding.incNb.text.clear()
        binding.incNb.text.insert(0, "1")

        // Exo 5
        val adapter = ListExo4Adapter()
        binding.listExo5.adapter = adapter
        adapter.data = (0..30).toList()
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

        binding.moveTab.setOnClickListener {
            val text = binding.passText.text.toString()
            if (text.isEmpty()) {
                Toast.makeText(this, "Le message est vide", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(applicationContext, Exo4Activity::class.java)
                intent.putExtra("text", text)
                startActivity(intent)
            }
        }
    }
}