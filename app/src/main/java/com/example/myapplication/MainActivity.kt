package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvmarca: TextView? = null
    var tvplaca: TextView? = null
    var tvaño: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvmarca = findViewById(R.id.txtmarca)
        tvplaca = findViewById(R.id.txtplaca)
        tvaño = findViewById(R.id.txtaño)
        val vehiculo2 = intent.getStringExtra("com.example.myapplicacion.MenuActivity2.VEHICULO")
        Toast.makeText(this, vehiculo2, Toast.LENGTH_SHORT).show()

        val vehiculocamioneta = Vehiculo("Toyota", 2020, "dos mil quince")
        val vehiculobus = Vehiculo("coaster", 2030, "dos mil diez")
        val vehiculocamion = Vehiculo("nissan", 2040, "dos mil cinco")

        if (vehiculo2 == "vehiculo: camioneta") {
            tvmarca?.text = vehiculocamioneta.marca
            tvplaca?.text = vehiculocamioneta.placa.toString()
            tvaño?.text = vehiculocamioneta.año
        } else if (vehiculo2 == "vehiculo: bus") {
            tvmarca?.text = vehiculocamioneta.marca
            tvplaca?.text = vehiculocamioneta.placa.toString()
            tvaño?.text = vehiculocamioneta.año
        } else if (vehiculo2 == "vehiculo: camion") {
            tvmarca?.text = vehiculocamioneta.marca
            tvplaca?.text = vehiculocamioneta.placa.toString()
            tvaño?.text = vehiculocamioneta.año
        }
    }
}