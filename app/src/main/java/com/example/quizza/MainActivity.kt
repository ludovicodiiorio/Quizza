package com.example.quizza

import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.quizza.databinding.LauncherBinding

class MainActivity : AppCompatActivity() {
    private lateinit var launcherBinding: LauncherBinding
    private lateinit var audioPlayer: MediaPlayer
    private lateinit var countDownTimer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launcherBinding = LauncherBinding.inflate(layoutInflater)
        setContentView(launcherBinding.root)

        launchBackgroundMusic()
        runTimer()
    }



    override fun onBackPressed() {
        audioPlayer.stop()
    }

    private fun launchBackgroundMusic() {
        audioPlayer = MediaPlayer.create(applicationContext, R.raw.background_music)
        audioPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
        audioPlayer.isLooping = true
        audioPlayer.start()
    }

    private fun runTimer() {
        countDownTimer = object: CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                val intent = Intent(applicationContext, Login::class.java)
                startActivity(intent)
            }
        }.start()
    }
}