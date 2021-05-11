package com.example.quizza

import android.os.Bundle
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
    }

}