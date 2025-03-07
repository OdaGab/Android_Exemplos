package com.odair.exemplo01

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.odair.exemplo01.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var cor = ""

    companion object{
        const val ARQUIVO_PREFERENCIAS = "ArquivoPreferencias"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        binding.cor1.setOnClickListener() {
            cor = "#FF03DAC5"

        }
        binding.cor2.setOnClickListener(){
            cor = "#FFBB86FC"
        }

        binding.cor3.setOnClickListener(){
            cor = "#0000FF"
        }

        binding.cor4.setOnClickListener(){
            cor = "#FF0000"
            }
        }

    private fun salvar(cor : String){

        binding.layoutPrincipal.setBackgroundColor(Color.parseColor(cor))

       binding.btnTrocarCorFundo.setOnClickListener{view -> 

           val preferencias = getPreferences(ARQUIVO_PREFERENCIAS, MODE_PRIVATE)
           val editor = preferencias.edit()
           editor.putString("cor", cor)
           editor.apply()
       }
    }
    private fun snackbaar(){

    }
}