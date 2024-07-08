package com.abindustrybreeze.features.location.shopRevisitStatus

import com.abindustrybreeze.features.location.shopdurationapi.ShopDurationApi
import com.abindustrybreeze.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}