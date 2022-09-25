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

        binding.btnAKm.setOnClickListener {
            aKilometros()
        }
        binding.btnAHm.setOnClickListener {
            aHectometros()
        }
        binding.btnADm.setOnClickListener {
            aDecametros()
        }
        binding.btnAM.setOnClickListener {
            aMetros()
        }
        binding.btnADcm.setOnClickListener {
            aDecimetros()
        }
        binding.btnACcm.setOnClickListener {
            aCentimetros()
        }
        binding.btnAMmm.setOnClickListener {
            aMilimetros()
        }

    }
    fun aKilometros(){
        val equivalencia_aKilometros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aKilometros = (metros.toDouble() / 1000)
        binding.labelTransformado.text = "A kilometros"
        binding.labelResultado.text = "$equivalencia_aKilometros"
    }
    fun aHectometros(){
        val equivalencia_aHectometros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aHectometros = (metros.toDouble() / 100)
        binding.labelTransformado.text = "A Hectometros"
        binding.labelResultado.text = "$equivalencia_aHectometros"
    }
    fun aDecametros(){
        val equivalencia_aDecametros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aDecametros = (metros.toDouble() / 10)
        binding.labelTransformado.text = "A Decametros"
        binding.labelResultado.text = "$equivalencia_aDecametros"
    }
    fun aMetros(){
        val equivalencia_aMetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aMetros = (metros.toDouble() * 1)
        binding.labelTransformado.text = "A metros"
        binding.labelResultado.text = "$equivalencia_aMetros"
    }
    fun aDecimetros(){
        val equivalencia_aDecimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aDecimetros = (metros.toDouble() * 10)
        binding.labelTransformado.text = "A Decimetros"
        binding.labelResultado.text = "$equivalencia_aDecimetros"
    }
    fun aCentimetros(){
        val equivalencia_aCentimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aCentimetros = (metros.toDouble() * 100)
        binding.labelTransformado.text = "A Centimetros"
        binding.labelResultado.text = "$equivalencia_aCentimetros"
    }
    fun aMilimetros(){
        val equivalencia_aMilimetros: Double
        val metros: Int = binding.editTextMetros.text.toString().toInt()
        equivalencia_aMilimetros = (metros.toDouble() * 1000)
        binding.labelTransformado.text = "A Milimetros"
        binding.labelResultado.text = "$equivalencia_aMilimetros"
    }

}