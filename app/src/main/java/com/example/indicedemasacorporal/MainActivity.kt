package com.example.indicedemasacorporal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity : Button = findViewById(R.id.Calcular)
        btnOpenActivity.setOnClickListener{

            var height  = Altura
            var weight = Peso
            val intent = Intent(this, Main2Activity :: class.java)
            //intent.putExtra("Peso", IMC)

           startActivity(intent)
        }

        val onLongClickListener : Button = findViewById(R.id.Calcular)
        onLongClickListener.setOnLongClickListener{
            Toast.makeText(this, "IMC = Peso(Kg) / Altura(M)^2", Toast.LENGTH_SHORT).show();
            return@setOnLongClickListener true
        }
    }


}
