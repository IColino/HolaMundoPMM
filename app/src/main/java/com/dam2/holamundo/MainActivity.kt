package com.dam2.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var contenedor: ConstraintLayout = findViewById(R.id.ContenedorMain)
        var texto :TextView = TextView(this)
        texto.text="Adios"
        texto.width = 500
        texto.height = 50
        contenedor.addView(texto) //Le colgamos el contenedor
    }
}