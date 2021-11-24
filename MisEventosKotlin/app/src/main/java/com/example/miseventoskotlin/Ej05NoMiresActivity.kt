package com.example.miseventoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton
import com.example.miseventoskotlin.databinding.ActivityEj05NoMiresBinding

class Ej05NoMiresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEj05NoMiresBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj05NoMiresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.setOnClickListener{
            if((it as ToggleButton).isChecked)
                binding.imageView3.visibility= View.VISIBLE
            else
                binding.imageView3.visibility=View.INVISIBLE
        }
    }
}