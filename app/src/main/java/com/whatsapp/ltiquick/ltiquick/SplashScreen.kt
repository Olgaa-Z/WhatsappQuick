package com.whatsapp.ltiquick.ltiquick

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        requestedOrientation= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        handler= Handler()
        handler.postDelayed(Runnable {
            var intent=intent
            intent= Intent (this@SplashScreen,MainActivity::class.java)
            startActivity(intent)
            this@SplashScreen.finish()
        },3000)
    }
}
