package com.jdlstudios.comvertidordeunidades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.jdlstudios.comvertidordeunidades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCentimetro.setOnClickListener {
            aCentimetros()
        }
        binding.btnEquivalir.setOnClickListener {
            aCentimetros()
        }
    }
    fun aKilometros(){
        val equivalencia_aKilometros:Int
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aKilometros = (metros * 1000)
        binding.equivalencia.text = "$equivalencia_aKilometros"
    }
    fun aHectometros(){
        val equivalencia_aHectometros:Int
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aHectometros = (metros * 100)
        binding.equivalencia.text = "$equivalencia_aHectometros"
    }
    fun aDecametros(){
        val equivalencia_aDecametros:Int
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aDecametros = (metros * 10)
        binding.equivalencia.text = "$equivalencia_aDecametros"
    }
    fun aMetros(){
        val equivalencia_aMetros:Int
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aMetros = (metros * 1)
        binding.equivalencia.text = "$equivalencia_aMetros"
    }
    fun aDecimetros(){
        val equivalencia_aDecimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aDecimetros = (metros.toDouble() / 10)
        binding.equivalencia.text = "La equivalencia es $equivalencia_aDecimetros"
    }
    fun aCentimetros(){
        val equivalencia_aCentimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aCentimetros = (metros.toDouble() / 100)
        binding.equivalencia.text = "La equivalencia es $equivalencia_aCentimetros"
    }
    fun aMilimetros(){
        val equivalencia_aMilimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aMilimetros = (metros.toDouble() / 1000)
        binding.equivalencia.text = "La equivalencia es $equivalencia_aMilimetros"
    }

}