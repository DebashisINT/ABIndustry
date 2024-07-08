package com.abindustrybreeze.features.dashboard.presentation.api.dayStartEnd

import com.abindustrybreeze.features.stockCompetetorStock.api.AddCompStockApi
import com.abindustrybreeze.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}