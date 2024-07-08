package com.abindustrybreeze.features.newcollection.model

import com.abindustrybreeze.app.domain.CollectionDetailsEntity
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}