package com.example.daggertot

import dagger.Component

@Component
interface CoffeeComponent {
   fun getCoffe() : Coffee

   fun inject (mainActivity:MainActivity)
}