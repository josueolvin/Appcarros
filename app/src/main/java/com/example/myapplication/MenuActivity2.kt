package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MenuActivity2 : AppCompatActivity() {
    val Tag = "com.example.myapplicacion.MenuActivity2.VEHICULO"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val btncamioneta = findViewById<Button>(R.id.btncamioneta)
        val btnbus = findViewById<Button>(R.id.btnbus)
        val btncamion = findViewById<Button>(R.id.btncamion)

        btncamioneta.setOnClickListener(View.OnClickListener {
           // Toast.makeText( this, "vehiculo: camioneta ", Toast.LENGTH_SHORT ). show()
            val intent = Intent(this, MainActivity::class.java )
            intent.putExtra(Tag, "vehiculo: camioneta")
            startActivity(intent)
        })
        btnbus.setOnClickListener(View.OnClickListener {
            //Toast.makeText( this, "vehiculo: bus ", Toast.LENGTH_SHORT ). show()
            val intent = Intent(this, MainActivity::class.java )
            intent.putExtra(Tag, "vehiculo: bus")
            startActivity(intent)
        })
        btncamion.setOnClickListener(View.OnClickListener {
            //Toast.makeText( this, "vehiculo: camion ", Toast.LENGTH_SHORT ). show()
            val intent = Intent(this, MainActivity::class.java )
            intent.putExtra(Tag, "vehiculo: camion")
            startActivity(intent)
        })
    }
}