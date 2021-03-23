package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Root @Inject constructor(
    posData: PosData,
    smsData: SmsData,
    moscowMapsData: MoscowMapsData,
    piterMapsData: PiterMapsData
) {

    init {
        L.d("ooo")
    }

    fun getRoot(

    ) {
        L.d("ooo")
    }
}