package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.miseventoskotlin.databinding.ActivityEj03BotonParasitadorBinding

class Ej03BotonParasitadorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj03BotonParasitadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj03BotonParasitadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bVictima.setOnClickListener{
            Toast.makeText(this,"Estoy perfectamente", Toast.LENGTH_SHORT).show()
        }

        binding.bParasito.setOnClickListener{
            Toast.makeText(this,"Parasitando a la víctima",Toast.LENGTH_SHORT).show()
            binding.bVictima.setOnClickListener{
                Toast.makeText(this,"He sido parasitado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}