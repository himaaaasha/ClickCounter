package com.example.hellowworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.hellowworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.setTitle("Click Counter")

        var timeClicked = 0
        binding.button.setOnClickListener{
            timeClicked = timeClicked + 1
            binding.textView.text = timeClicked.toString()
        }
    }
}