package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.*

object ExchangeRatesRepository : IExchangeRatesRepository {
    override fun getExchangeRates(properties: Set<IExchangeRatesProperty>): IVarCus {
        val httpProperties = properties.map {
            when (it) {
                is IExchangeRatesDataProperty -> DateHTTPProperty(it.value)
                else -> throw Exception()
            }
        }.toSet<IHTTPProperty>()
        val xml = HTTPExchangeRates.getXML(httpProperties)
        return XMLExchangeRatesDeserializer.getVarCus(xml)
    }

    fun getExchangeRates(vararg properties: IExchangeRatesProperty): IVarCus =
        getExchangeRates(properties.toSet())
}