package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.miseventoskotlin.databinding.ActivityEj02ContadoresBinding

class Ej02ContadoresActivity : AppCompatActivity() {

    private lateinit var binding:ActivityEj02ContadoresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj02ContadoresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contador1=0
        var contador2=0
        var contadorGlobal=0

        var textoC1=binding.bContador1.text.toString()
        var textoC2=binding.bContador2.text.toString()

        binding.bContador1.setOnClickListener{
            contador1++
            contadorGlobal++
            (it as Button).text= "$textoC1 (${contador1})"
            binding.tvContador1.text="${contador1}"
            binding.tvContadorGlobal.text="${contadorGlobal}"
            Toast.makeText(this,"Pulsando "+textoC1,Toast.LENGTH_SHORT).show()
        }

        binding.bContador2.setOnClickListener{
            contador2++
            contadorGlobal++
            (it as Button).text= "$textoC2 (${contador2})"
            binding.tvContador2.text="${contador2}"
            binding.tvContadorGlobal.text="${contadorGlobal}"
            Toast.makeText(this,"Pulsando "+textoC2,Toast.LENGTH_SHORT).show()
        }

        binding.imageView.setOnClickListener{
            contador1=0
            binding.tvContador1.text="0"
            binding.bContador1.text=textoC1
        }

        binding.imageView2.setOnClickListener{
            contador2=0
            binding.tvContador2.text="0"
            binding.bContador2.text=textoC2
        }
    }
}