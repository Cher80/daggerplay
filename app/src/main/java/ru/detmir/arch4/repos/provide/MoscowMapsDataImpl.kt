package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L


class MoscowMapsDataImpl(
    val base: Base
): MoscowMapsData
{
    init {
        L.d("ooo")
    }

    override fun getMapsData(): String {
        L.d("ooo")
        return "s"
    }
}