package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.miseventoskotlin.databinding.ActivityEj01VariantesCallbackBinding

class Ej01VariantesCallbackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj01VariantesCallbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj01VariantesCallbackBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            Toast.makeText(this,"Has pulasdo "+(it as Button).text,Toast.LENGTH_LONG).show()
            binding.textView.text="Has pulsado "+(it as Button).text
        }
    }
}