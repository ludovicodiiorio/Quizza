package com.example.quizza

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window

class LoginDialog(applicationContext: Context): Dialog(applicationContext) {

    init{
        setCancelable(true)
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.login_dialog)
    }
}