package br.com.livroandroid.helloreceiver

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnviarBroadcast.setOnClickListener {
            // Enviar uma mensagem de broadcast
            sendBroadcast(Intent("BINGO"))
            Toast.makeText(this, "Intent enviada!", Toast.LENGTH_LONG).show()
        }
    }
}
