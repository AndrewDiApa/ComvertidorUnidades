package com.jdlstudios.comvertidordeunidades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jdlstudios.comvertidordeunidades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var metros:Long

        binding.btnCentimetro.setOnClickListener {
            metros = binding.editTextMetros.text.toString().toLong()
            Log.d("metros","$metros")
        }

    }
}