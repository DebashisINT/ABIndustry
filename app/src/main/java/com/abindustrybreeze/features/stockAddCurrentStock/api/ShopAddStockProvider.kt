package com.abindustrybreeze.features.stockAddCurrentStock.api

import com.abindustrybreeze.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.abindustrybreeze.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}