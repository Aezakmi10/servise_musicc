 package com.example.servise_music

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


 class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var startBtn:Button
     lateinit var stopBtn:Button
     lateinit var musicNode:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBtn=findViewById(R.id.btnStart)
        stopBtn=findViewById(R.id.btnStop)
        musicNode=findViewById(R.id.musicNode)

        stopBtn.setOnClickListener(this)
        startBtn.setOnClickListener(this)
    }
     override fun onClick(v: View?)
     {
         if(v===startBtn)
         {
             musicNode.visibility= View.VISIBLE
             startService(Intent(this,MyService::class.java))

         }else
         {
             musicNode.visibility=View.GONE
             stopService(Intent(this,MyService::class.java))

         }
     }
}