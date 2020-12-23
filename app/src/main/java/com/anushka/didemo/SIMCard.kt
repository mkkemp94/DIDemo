package com.anushka.didemo

import android.util.Log

class SIMCard() {

    private lateinit var serviceProvider: ServiceProvider

    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    // Method injection
    fun setServiceProvider(serviceProvider: ServiceProvider) {
        this.serviceProvider = serviceProvider
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}