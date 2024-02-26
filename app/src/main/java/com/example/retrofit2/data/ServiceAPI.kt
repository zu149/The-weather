package com.example.retrofit2.data

import com.example.retrofit2.entities.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface ServiceAPI {

    @GET("data/2.5/weather?q=Moscow&appid=b97b0ed4e03cc2ec2bc2bd5b70f00850")
    fun getWeather(
        @Query("q") cityName: String
    ): Single<WeatherResponse>

}