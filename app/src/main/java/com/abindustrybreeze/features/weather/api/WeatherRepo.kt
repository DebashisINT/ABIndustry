package com.abindustrybreeze.features.weather.api

import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.task.api.TaskApi
import com.abindustrybreeze.features.task.model.AddTaskInputModel
import com.abindustrybreeze.features.weather.model.ForeCastAPIResponse
import com.abindustrybreeze.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}