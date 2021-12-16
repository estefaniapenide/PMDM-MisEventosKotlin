package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.example.miseventoskotlin.databinding.ActivityEj06QuesoJamonLechugaBinding

class Ej06QuesoJamonLechugaAtivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj06QuesoJamonLechugaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj06QuesoJamonLechugaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cbJamon.setOnCheckedChangeListener{_,isChecked ->
            if(binding.cbJamon.isChecked) Bocata.jamon=true
            binding.tvFrase.text=Bocata.toString()
        }

        binding.cbQueso.setOnCheckedChangeListener{_,isChecked ->
            if(binding.cbQueso.isChecked) Bocata.queso=true
            binding.tvFrase.text=Bocata.toString()
        }

        binding.cbLechuga.setOnCheckedChangeListener{_,isChecked ->
            if(binding.cbLechuga.isChecked) Bocata.lechuga=true
            binding.tvFrase.text=Bocata.toString()
        }

    }
}