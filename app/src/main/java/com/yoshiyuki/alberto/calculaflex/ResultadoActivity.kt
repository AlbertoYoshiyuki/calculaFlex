package com.yoshiyuki.alberto.calculaflex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resultado.*

/**
 * Created by Alberto on 09/03/2018.
 */
class ResultadoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val gasolina = intent?.getStringExtra("GASOLINA")!!.toDouble()
        val alcool = intent?.getStringExtra("ALCOOL")!!.toDouble()

        val calculoFlex = gasolina / alcool

        //menor e alcool , maior e gasolina
        if(calculoFlex < 0.7)
        {
            texto_combustivel.text = "ALCOOL"
        }
        else
        {
            texto_combustivel.text = "GASOLINA"
        }

    }

}