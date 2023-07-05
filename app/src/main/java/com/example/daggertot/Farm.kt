package com.example.daggertot

import javax.inject.Inject

class Farm {
    @Inject
    constructor()

    fun getBeans():String{

        return "beans"
    }

}