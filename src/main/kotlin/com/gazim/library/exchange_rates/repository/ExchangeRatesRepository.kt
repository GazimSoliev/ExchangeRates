package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.*

object ExchangeRatesRepository : IExchangeRatesRepository {
    override fun getExchangeRates(properties: Set<IExchangeERProperty>): IVarCus {
        val httpProperties = properties.map {
            when (it) {
                is IDateExcERProp -> DateExcHTTPProp(it.date)
                else -> throw Exception()
            }
        }.toSet<IExchangeHTTPProperty>()
        val xml = HTTPExchangeRates.getXML(httpProperties)
        return XMLExchangeDeserializer.getVarCus(xml)
    }

    fun getExchangeRates(vararg properties: IExchangeERProperty): IVarCus =
        getExchangeRates(properties.toSet())

    override fun getExchangeRecords(): IValCurs {
        TODO("Not yet implemented")
    }
}