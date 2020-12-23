package com.anushka.didemo

import dagger.Component
import dagger.Provides

@Component(modules = [MemoryCardModule::class])
interface SmartPhoneComponent {

    fun getSmartPhone() : SmartPhone

}