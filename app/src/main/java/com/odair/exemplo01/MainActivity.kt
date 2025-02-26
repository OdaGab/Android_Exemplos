package com.odair.exemplo01

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.odair.exemplo01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var cor = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.cor1.setOnClickListener() {
            cor = "#FF03DAC5"
            binding.btnTrocarCorFundo.setOnClickListener{
                binding.layoutPrincipal.setBackgroundColor(Color.parseColor(cor))
            }
        }
        binding.cor2.setOnClickListener(){
            cor = "#FFBB86FC"
            binding.btnTrocarCorFundo.setOnClickListener{
                binding.layoutPrincipal.setBackgroundColor(Color.parseColor(cor))
            }
        }
        binding.cor3.setOnClickListener(){
            cor = "#03A9F4"
            binding.btnTrocarCorFundo.setOnClickListener{
                binding.layoutPrincipal.setBackgroundColor(Color.parseColor(cor))
            }
        }
        binding.cor4.setOnClickListener(){
            cor = "#FF0000"
            binding.btnTrocarCorFundo.setOnClickListener{
                binding.layoutPrincipal.setBackgroundColor(Color.parseColor(cor))
            }
        }

    }
}