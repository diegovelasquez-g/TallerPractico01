package com.example.tallerpractico01_vg190501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var prom: Button
lateinit var name: EditText
lateinit var eval1: EditText
lateinit var eval2: EditText
lateinit var eval3: EditText
lateinit var eval4: EditText
lateinit var eval5: EditText
lateinit var result: TextView

class Ejercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        prom = findViewById(R.id.btnCalcular)
        name = findViewById(R.id.txtAlumno)
        eval1 = findViewById(R.id.txtNota1)
        eval2 = findViewById(R.id.txtNota2)
        eval3 = findViewById(R.id.txtNota3)
        eval4 = findViewById(R.id.txtNota4)
        eval5 = findViewById(R.id.txtNota5)
        result = findViewById(R.id.txtResultado)
        prom.setOnClickListener{
            val student : String = name.text.toString()

            if(TextUtils.isEmpty(student)){
                Toast.makeText(this,"Por favor ingrese el nombre del alumno", Toast.LENGTH_SHORT).show()
            }else if(TextUtils.isEmpty((eval1.text.toString()))||TextUtils.isEmpty((eval2.text.toString()))||TextUtils.isEmpty((eval3.text.toString()))||TextUtils.isEmpty((eval4.text.toString()))||TextUtils.isEmpty((eval5.text.toString()))){
                Toast.makeText(this,"Por favor complete los campos de notas", Toast.LENGTH_SHORT).show()
            }else{
                val grade1: Double = eval1.text.toString().toDouble()
                val grade2: Double = eval2.text.toString().toDouble()
                val grade3: Double = eval3.text.toString().toDouble()
                val grade4: Double = eval4.text.toString().toDouble()
                val grade5: Double = eval5.text.toString().toDouble()
                val ans: Double = (grade1+grade2+grade3+grade4+grade5)/5
                val ansRound: Double = Math.round(ans*100.0)/100.0
                var res = "Reprobado"
                if(ans>=6){
                    res = "Aprobado"
                }
                result.setText("El promedio del alumno "+student+" es: "+ansRound.toString())
                Toast.makeText(this,res,Toast.LENGTH_LONG).show()

            }

        }

    }
}