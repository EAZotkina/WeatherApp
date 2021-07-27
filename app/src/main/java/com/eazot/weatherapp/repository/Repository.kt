package com.eazot.weatherapp.repository

import com.eazot.weatherapp.data.Weather

open class Repository: IRepository {

    override fun getWeathers(): List<Weather> {
        TODO("Not yet implemented")
    }
}
interface IRepository{
    fun getWeathers():List<Weather>
}

object RepositorySingle: IRepository{

    private val weathers: List<Weather> = listOf(
    Weather("Москва", 30),
    Weather("Санкт-Петербург", 20),
    Weather("Самара", 35),
    Weather("Тюмень", 29),
    Weather("Рязань", 28)
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }
}



