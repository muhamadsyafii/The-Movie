/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class Token(
    @Json(name = "expires_at")
    val expiresAt: String,
    @Json(name = "success")
    val success: Boolean,
    @Json(name = "request_token")
    val requestToken: String
)