package com.apap.crimedataapp.map.contract

import com.apap.crimedataapp.base.BasePresenter
import com.apap.crimedataapp.base.BaseView
import org.mapsforge.core.model.LatLong

class LocationContract {

    interface View : BaseView {
        fun returnCountry(country: String)
    }

    interface Presenter : BasePresenter {
        fun getCountryForLocation(coordinates: LatLong)
    }
}
