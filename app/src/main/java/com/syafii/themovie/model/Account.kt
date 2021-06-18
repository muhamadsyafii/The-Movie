/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class Account(
    @Json(name = "include_adult")
    val includeAdult: Boolean,
    @Json(name = "iso_3166_1")
    val iso31661: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "avatar")
    val avatar: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "iso_639_1")
    val iso6391: String,
    @Json(name = "username")
    val username: String
)