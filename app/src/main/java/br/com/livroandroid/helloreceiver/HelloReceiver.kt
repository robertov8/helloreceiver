package br.com.livroandroid.helloreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class HelloReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("livroandroid", "Hello Receiver !!!")
        // Cria uma notificação
        val intent = Intent(context, MainActivity::class.java)
        NotificationUtil.create(context, 1, intent, "Livro Android", "Hello Receiver")
    }
}