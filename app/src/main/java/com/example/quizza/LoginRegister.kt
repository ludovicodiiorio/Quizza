package com.example.quizza

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.quizza.databinding.LoginRegisterBinding

class LoginRegister : AppCompatActivity(){

    private lateinit var loginBinding: LoginRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = LoginRegisterBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.buttonLogin.setOnClickListener{
            LoginDialog(this).show()
        }

        loginBinding.buttonRegister.setOnClickListener{
            RegisterDialog(this).show()
        }

        loginBinding.btnMusic.setOnClickListener{
            val builder = AlertDialog.Builder(this)

            if(MainActivity.audioPlayer.isPlaying) {        //sound is playing
                builder.setTitle(R.string.sound_alert_title)
                builder.setMessage(R.string.sound_disable_text)
                builder.setPositiveButton("YES", DialogInterface.OnClickListener { dialog, it -> MainActivity.audioPlayer.pause()})
                builder.setNegativeButton("NO", DialogInterface.OnClickListener { dialog, it -> })

            }else{                                       //sound is not playing
                builder.setTitle(R.string.sound_alert_title)
                builder.setMessage(R.string.sound_enable_text)
                builder.setPositiveButton("YES", DialogInterface.OnClickListener { dialog, it -> MainActivity.audioPlayer.start()})
                builder.setNegativeButton("NO", DialogInterface.OnClickListener { dialog, it -> })
            }

            builder.create().show()
        }

        loginBinding.btnPalette.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Choose a theme")
            builder.setItems(arrayOf("Dark", "Light", "Neutral"), DialogInterface.OnClickListener{ dialog, which -> println("Hai selezionato " + which.toString())})
            builder.create().show()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish();
    }

}