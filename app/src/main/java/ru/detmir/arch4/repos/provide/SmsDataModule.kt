package ru.detmir.arch4.repos.provide

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class SmsDataModule {
    @Binds
    @Singleton
    abstract fun getSmsData(
        smsDataImpl: SmsDataImpl
    ): SmsData
}