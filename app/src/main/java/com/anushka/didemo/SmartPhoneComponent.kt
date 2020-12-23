package com.anushka.didemo

import dagger.Component
import dagger.Provides

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
interface SmartPhoneComponent {

    // Now MainActivity will get everything in the graph
    fun inject(mainActivity: MainActivity)

}