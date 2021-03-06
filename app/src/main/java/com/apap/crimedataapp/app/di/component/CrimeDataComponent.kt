package com.apap.crimedataapp.app.di.component

import com.apap.crimedataapp.app.App
import com.apap.crimedataapp.app.di.module.*
import dagger.Component

@Component(modules = arrayOf(AppModule::class, ContextModule::class, RepositoryModule::class, LocationModule::class, NetModule::class, InteractorModule::class))
interface CrimeDataComponent {
    fun inject(app: App)
    fun plus(locationModule: LocationModule)
}
