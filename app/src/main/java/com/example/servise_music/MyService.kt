package com.example.servise_music

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService: Service() {
    private val iBinder:IBinder?=null
    private lateinit var player: MediaPlayer
    override fun onBind(intent: Intent?): IBinder? {
        return iBinder
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    player=MediaPlayer.create(this,R.raw.chitthi)
        player.isLooping=true
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
}