/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class Session(
    @Json(name = "success")
    val success : Boolean,
    @Json(name = "session_id")
    val sessionId : String
)