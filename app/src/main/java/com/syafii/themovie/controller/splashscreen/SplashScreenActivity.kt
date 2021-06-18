/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.controller.splashscreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.syafii.themovie.controller.main.MainActivity
import com.syafii.themovie.R
import com.syafii.themovie.util.openActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(MainActivity::class.java)
        }, 3000)
    }
}