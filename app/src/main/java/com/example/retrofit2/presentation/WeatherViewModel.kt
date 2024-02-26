package com.example.retrofit2.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.retrofit2.domain.Repository
import com.example.retrofit2.entities.WeatherResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class WeatherViewModel : ViewModel() {

    private val repository = Repository()
    val weatherLiveData = MutableLiveData<WeatherResponse>()

    fun getWeather() {
        repository.getDataService("moscow")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                       weatherLiveData.value = it
            },{

            })
    }
}