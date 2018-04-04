package com.example.user.kotmenuapp

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AudioAct : AppCompatActivity() {

    var mp=MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

        mp=MediaPlayer.create(this,R.raw.trck)

    }

    fun playAudio(v:View)
    {
        mp.start()
    }

    fun pauseAudio(v:View)
    {
        mp.pause()
    }
}
