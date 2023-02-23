package com.example.tallerpractico01_vg190501

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.Ejercicio1){
            Toast.makeText(this,"Bienvenido al ejercicio 1",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Ejercicio1::class.java)
            startActivity(intent)
        }
        if(id == R.id.Ejercicio2){
            Toast.makeText(this,"Bienvenido al ejercicio 2",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Ejercicio2::class.java)
            startActivity(intent)
        }
        if(id == R.id.Ejercicio3){
            Toast.makeText(this,"Bienvenido al ejercicio 3",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,Ejercicio3::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}