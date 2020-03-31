package br.com.kely.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){

        var texto = findViewById<TextView>(R.id.textViewNumeroSorteado)

        //Gera numero randomico de 0 a 10(exceto o numro 11)
        var numeroSorteado = Random().nextInt(11)

        texto.setText("Numero sorteado é: $numeroSorteado " )
    }
}
