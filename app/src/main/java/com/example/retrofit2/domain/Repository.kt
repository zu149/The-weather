package com.example.retrofit2.domain

import com.example.retrofit2.data.APIService
import com.example.retrofit2.entities.WeatherResponse
import io.reactivex.Single
import retrofit2.Retrofit


class Repository {

    fun getDataService(cityName: String): Single<WeatherResponse> {
        return APIService.api.getWeather(cityName)
    }
}