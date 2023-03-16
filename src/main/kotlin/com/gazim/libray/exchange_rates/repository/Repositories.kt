package com.gazim.libray.exchange_rates.repository

import com.gazim.libray.exchange_rates.model.IExchangeRatesProperty
import com.gazim.libray.exchange_rates.model.IHTTPProperty
import com.gazim.libray.exchange_rates.model.IVarCus

interface IXMLExchangeRatesDeserializer {
    fun getVarCus(xml: String): IVarCus
}

interface IHTTPExchangeRates {
    fun getXML(properties: Set<IHTTPProperty>): String
}

interface IExchangeRatesRepository {
    fun getExchangeRates(properties: Set<IExchangeRatesProperty>): IVarCus
}