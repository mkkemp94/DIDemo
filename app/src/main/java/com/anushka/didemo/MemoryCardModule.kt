package com.anushka.didemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memorySize: Int) {

    @Provides
    fun provideMemoryCard() : MemoryCard {
        Log.i("MYTAG", "Size of memory card: $memorySize")
        return MemoryCard()
    }

}