package de.telma.wordcards

import android.app.Application
import de.telma.wordcards.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.koinApplication

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        koinApplication {
            androidContext(this@App)
            modules(mainModule)
        }
    }
}