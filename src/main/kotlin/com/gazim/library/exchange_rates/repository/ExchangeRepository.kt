package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IDateExcERProp
import com.gazim.library.exchange_rates.model.IExchangeERProperty
import com.gazim.library.exchange_rates.model.IVarCus
import com.gazim.library.exchange_rates.model.exchange_http_property_models_impl.DateExcHTTPProp

object ExchangeRepository : IExchangeRepository {
    override fun getExchanges(properties: Set<IExchangeERProperty>): IVarCus {
        val httpProperties = properties.map {
            when (it) {
                is IDateExcERProp -> DateExcHTTPProp(date = it.date)
                else -> throw Exception()
            }
        }.toSet()
        val xml = HTTPExchange.getXML(httpProperties)
        return XMLExchangeDeserializer.deserialize(xml)
    }
}