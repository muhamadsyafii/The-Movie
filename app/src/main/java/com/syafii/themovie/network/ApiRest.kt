/*
 * Created by Muhamad Syafii
 * Friday, 18/6/2021
 * Copyright (c) 2021.
 * All Rights Reserved
 */

package com.syafii.themovie.network

import com.syafii.themovie.model.Token
import com.syafii.themovie.util.constants.API_KEY
import io.reactivex.Flowable
import retrofit2.http.GET

interface ApiRest {
    @GET("authentication/token/new$API_KEY")
    fun getReqToken() : Flowable<Token>
}