package com.example.daggertot

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
//    lateinit var farm:Farm
//    lateinit var river:River
    @Inject
    lateinit var coffee: Coffee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var coffee = Coffee(farm, river)

    var component:CoffeeComponent
  component=DaggerCoffeeComponent.create()
        coffee.connectElectricity()
        component.inject(mainActivity = MainActivity())
    Log.d(TAG,"Ayat onCreate :" + coffee.getCoffeeCup() )
    }

}