package com.example.tallerpractico01_vg190501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.RadioButton

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)
        val num1=findViewById<EditText>(R.id.txtNumber1)
        val num2=findViewById<EditText>(R.id.txtNumber2)
        val txtResultado=findViewById<TextView>(R.id.txtResultado2)
        val button=findViewById<Button>(R.id.btnEnviar)
        val btnSuma=findViewById<RadioButton>(R.id.rbtnSuma)
        val btnResta=findViewById<RadioButton>(R.id.rbtnResta)
        val btnMultiplicar=findViewById<RadioButton>(R.id.rbtnMultiplicar)
        val btnDividir=findViewById<RadioButton>(R.id.rbtnDividir)

        button.setOnClickListener{
            val nr1: Double = num1.text.toString().toDouble()
            val nr2: Double = num2.text.toString().toDouble()
            var resultado: Double = 0.0
            if(btnSuma.isChecked()) resultado = nr1 + nr2
            if(btnResta.isChecked()) resultado = nr1 - nr2
            if(btnMultiplicar.isChecked()) resultado = nr1 * nr2
            if(btnDividir.isChecked()) resultado = nr1 / nr2
            txtResultado.setText("Resultado: " +resultado.toString())
        }
    }
}