/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class Result(
    @Json(name = "results")
    val data : List<MovieItems>
)