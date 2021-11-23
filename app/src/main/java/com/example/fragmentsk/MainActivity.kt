package com.example.fragmentsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navegacion = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val controlador = findNavController(R.id.fragmentContainerView)
        navegacion.setupWithNavController(controlador)

    }
}