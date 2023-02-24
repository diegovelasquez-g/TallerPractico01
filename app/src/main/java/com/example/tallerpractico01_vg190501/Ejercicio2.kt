package com.example.tallerpractico01_vg190501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


lateinit var nombre: EditText
lateinit var salario: EditText
lateinit var isss: TextView
lateinit var renta: TextView
lateinit var total: TextView
lateinit var afp: TextView
lateinit var calcular: Button

class Ejercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        nombre = findViewById(R.id.txtNombre)
        salario = findViewById(R.id.txtSalario)
        isss = findViewById(R.id.txtISSS)
        renta = findViewById(R.id.txtRenta)
        total = findViewById(R.id.txtTotal)
        afp = findViewById(R.id.txtAFP)
        calcular = findViewById(R.id.btnCalcular)

        calcular.setOnClickListener{
            val sal: Double = salario.text.toString().toDouble()
            val afpRound: Double = Math.round((sal*0.04)*100.0)/100.0
            val rentaRound: Double = Math.round((sal*0.05)*100.0)/100.0
            val isssRound: Double = Math.round((sal*0.03)*100.0)/100.0
            val res: Double = sal - afpRound - rentaRound - isssRound
            val resRound: Double = Math.round(res*100.0)/100.0

            isss.setText("ISSS: $"+isssRound.toString())
            afp.setText("AFP: $"+afpRound.toString())
            renta.setText("Renta: $"+rentaRound.toString())
            total.setText("Total: $"+resRound.toString())


        }
    }
}