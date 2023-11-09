package com.example.phrases

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_cat: Button = findViewById(R.id.btn_cat)
        val btn_goodbye: Button = findViewById(R.id.btn_goodbye)
        val btn_sorry: Button = findViewById(R.id.btn_sorry)
        val btn_love: Button = findViewById(R.id.btn_love)
        val btn_hello: Button = findViewById(R.id.btn_hello)
        val btn_no: Button = findViewById(R.id.btn_no)

        btn_cat.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.cat)
            mediaPlayer.start()
        }

        btn_goodbye.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.goodbye)
            mediaPlayer.start()
        }

        btn_sorry.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.sorry)
            mediaPlayer.start()
        }

        btn_love.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.iloveyou)
            mediaPlayer.start()
        }

        btn_hello.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.hello)
            mediaPlayer.start()
        }

        btn_no.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(this, R.raw.no)
            mediaPlayer.start()
        }

//        val buttonIds = mapOf(
//            R.id.btn_cat to R.raw.cat,
//            R.id.btn_goodbye to R.raw.goodbye,
//            R.id.btn_sorry to R.raw.sorry,
//            R.id.btn_love to R.raw.iloveyou,
//            R.id.btn_hello to R.raw.hello,
//            R.id.btn_no to R.raw.no
//        )
//
//        buttonIds.forEach { (buttonId, audioId) ->
//            val button = findViewById<Button>(buttonId)
//            button.setOnClickListener {
//                val mediaPlayer = MediaPlayer.create(this, audioId)
//                mediaPlayer.start()
//            }
//        }

//        buttonIds.forEach { (buttonId, audioId) ->
//            findViewById<Button>(buttonId).setOnClickListener {
//                MediaPlayer.create(this, audioId).start()
//            }
//        }
    }
}