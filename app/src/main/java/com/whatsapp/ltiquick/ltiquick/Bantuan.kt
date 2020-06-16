package com.whatsapp.ltiquick.ltiquick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.text.util.Linkify





class Bantuan : AppCompatActivity() {

    private var tvLinkify: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bantuan)

        tvLinkify = findViewById(R.id.web) as TextView
        tvLinkify!!.text =

                "https://www.lauwba.com \n"
        // proses menambahkan Links pada TextView
        Linkify.addLinks(tvLinkify, Linkify.ALL)
    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//    }
}
