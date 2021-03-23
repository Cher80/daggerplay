package ru.detmir.arch4.repos.provide

import ru.detmir.arch4.utils.L


class PiterMapsDataImpl(
    val base: Base
): PiterMapsData
{
    init {
        L.d("ooo")
    }

    override fun getMapsData(): String {
        L.d("ooo")
        return "s"
    }
}