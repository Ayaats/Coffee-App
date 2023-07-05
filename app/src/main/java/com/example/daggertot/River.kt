package com.example.daggertot

import javax.inject.Inject

class River {
    @Inject
    constructor()
    fun getWater():String{

        return "water"
    }


}