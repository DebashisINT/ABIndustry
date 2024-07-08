package com.abindustrybreeze.features.location.api

import com.abindustrybreeze.features.location.shopdurationapi.ShopDurationApi
import com.abindustrybreeze.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}