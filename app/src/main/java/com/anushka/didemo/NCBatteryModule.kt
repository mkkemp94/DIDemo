package com.anushka.didemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    // We know how to make a nickel cadmium battery...
    // That class has constructor injection
    // So no need to use "provides"
    @Binds
    abstract fun bindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery
}