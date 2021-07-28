package com.eazot.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.eazot.weatherapp.repository.Repository
import com.eazot.weatherapp.repository.RepositorySingle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerWeather = findViewById<RecyclerView>(R.id.recyclerWeather)
        val adapter = WeatherAdapter(RepositorySingle)
        recyclerWeather.adapter = adapter

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"Найти город",Toast.LENGTH_SHORT).show()
            }
        })
    }
}