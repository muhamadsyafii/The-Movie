/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.model

import com.squareup.moshi.Json

data class MovieItems(
    @Json(name = "vote_count")
    val voteCount : Int,
    @Json(name = "id")
    val id : Int,
    @Json(name = "video")
    val video : Boolean,
    @Json(name = "vote_average")
    val voteAverage : Float,
    @Json(name = "title")
    val title : String,
    @Json(name = "popularity")
    val popularity : Float,
    @Json(name = "poster_path")
    val posterPath : String,
    @Json(name = "original_language")
    val originalLanguage : String,
    @Json(name = "original_title")
    val originalTitle : String,
    @Json(name = "genre_ids")
    val genreIds : List<Int>,
    @Json(name = "backdrop_path")
    val backdropPath : String,
    @Json(name = "adult")
    val adult : String,
    @Json(name = "overview")
    val overview : String,
    @Json(name = "release_date")
    val releaseDate : String
)