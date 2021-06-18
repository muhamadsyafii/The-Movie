/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class Login(
    @Json(name = "password")
    val password : String,
    @Json(name = "request_token")
    val requestToken : String,
    @Json(name = "username")
    val username : String
)