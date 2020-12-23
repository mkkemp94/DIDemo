package com.anushka.didemo

import dagger.Component
import dagger.Provides

@Component
interface SmartPhoneComponent {

    fun getSmartPhone() : SmartPhone

}