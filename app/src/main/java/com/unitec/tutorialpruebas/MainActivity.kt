package com.unitec.tutorialpruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        val  x=23
    }
    override fun onCreate(savedInstanceState: Bundle?) {


        val v:(String, Int)->String ={cadena, valor->cadena+""+valor}
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("XXX", "Depurar esta parte ${MiLoginActivity.x}");

        findViewById<Button>(R.id.btn_mensajito).setOnClickListener {
            findViewById<TextView>(R.id.texto_actualizar).text="Oprimido"
        }


        findViewById<Button>(R.id.login).setOnClickListener {
             startActivity(Intent(applicationContext,OtraActivity::class.java ))
        }
    }
}