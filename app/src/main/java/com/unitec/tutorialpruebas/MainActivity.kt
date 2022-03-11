package com.unitec.tutorialpruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_mensajito).setOnClickListener {
            findViewById<TextView>(R.id.texto_actualizar).text="Oprimido"
        }


        findViewById<Button>(R.id.login).setOnClickListener {
             startActivity(Intent(applicationContext,OtraActivity::class.java ))
        }
    }
}