package com.yoshiyuki.alberto.calculaflex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLimpar.setOnClickListener{
            inputAlcool.editText?.setText("")
            inputGasolina.editText?.setText("")
            inputGasolina.editText?.requestFocus()
        }

        btnCalcularFlex.setOnClickListener{
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra("GASOLINA",
                    inputGasolina.editText?.text.toString())
            telaResultado.putExtra("ALCOOL",
                    inputAlcool.editText?.text.toString())

            startActivity(telaResultado)
        }

    }
}
