package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.miseventoskotlin.databinding.ActivityEj04RotacionBinding

class Ej04RotacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj04RotacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj04RotacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun mostrarTextoRotado(view: View?){
            view?.visibility=View.GONE
            binding.tvSigueRotando.visibility=View.VISIBLE
        }

        fun rotarTexto(view:View?){
            view!!.rotation+=12
        }

        binding.tvHazClick.setOnClickListener{mostrarTextoRotado(it)}
        binding.tvSigueRotando.setOnClickListener{rotarTexto(it)}
    }
}