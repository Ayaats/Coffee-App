package com.example.daggertot

import android.util.Log
import javax.inject.Inject

class Coffee {
    private final val TAG = "Coffee"
    //dagger can't inject private fields and final
   @Inject
   lateinit var farm: Farm
   @Inject
  lateinit var river: River
    @Inject
    constructor(){}

    fun getCoffeeCup():String{
        return farm.getBeans() +"+"+ river.getWater()
    }
    @Inject
    fun connectElectricity() {
        Log.d(TAG,"Connictig.........")
        
    }

}