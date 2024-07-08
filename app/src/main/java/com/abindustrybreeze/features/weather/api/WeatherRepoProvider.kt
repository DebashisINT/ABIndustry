package com.abindustrybreeze.features.weather.api

import com.abindustrybreeze.features.task.api.TaskApi
import com.abindustrybreeze.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}