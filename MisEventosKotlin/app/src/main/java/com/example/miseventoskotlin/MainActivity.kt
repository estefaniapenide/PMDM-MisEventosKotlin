package com.example.miseventoskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miseventoskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bEj1.setOnClickListener{ startActivity(Intent(this,Ej01VariantesCallbackActivity::class.java))}

        binding.bEj2.setOnClickListener{startActivity(Intent(this,Ej02ContadoresActivity::class.java))}

        binding.bEj3.setOnClickListener{startActivity(Intent(this,Ej03BotonParasitadorActivity::class.java))}

        binding.bEj4.setOnClickListener{startActivity(Intent(this,Ej04RotacionActivity::class.java))}

        binding.bEj5.setOnClickListener{startActivity(Intent(this,Ej05NoMiresActivity::class.java))}
    }
}