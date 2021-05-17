package com.example.quizza

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.quizza.databinding.LoginRegisterBinding

class Login : AppCompatActivity(){

    private lateinit var loginBinding: LoginRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = LoginRegisterBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)

        loginBinding.buttonLogin.setOnClickListener{

        }

        loginBinding.buttonRegister.setOnClickListener{

        }

        loginBinding.btnMusic.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.exit_dialog_title)
            builder.setMessage(R.string.exit_dialog_text)
            builder.setPositiveButton("YES", DialogInterface.OnClickListener{ dialog, it -> println(getString(R.string.yes_text)) })
            builder.setNegativeButton("NO", DialogInterface.OnClickListener{ dialog, it -> println(getString(R.string.no_text)) })
            builder.create().show()
        }

        loginBinding.btnPalette.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Choose a theme")
            builder.setItems(arrayOf("Dark", "Light", "Neutral"), DialogInterface.OnClickListener{ dialog, which -> println("Hai selezionato " + which.toString())})
            builder.create().show()
        }
    }

}