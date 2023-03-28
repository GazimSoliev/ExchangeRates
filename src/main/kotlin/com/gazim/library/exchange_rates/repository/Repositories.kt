package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IExchangeRatesProperty
import com.gazim.library.exchange_rates.model.IHTTPProperty
import com.gazim.library.exchange_rates.model.IValCurs
import com.gazim.library.exchange_rates.model.IVarCus

interface IXMLExchangeRatesDeserializer {
    fun getVarCus(xml: String): IVarCus
    fun getValCurs(xml: String): IValCurs
}

interface IHTTPExchangeRates {
    fun getXML(properties: Set<IHTTPProperty>): String
}

interface IExchangeRatesRepository {
    fun getExchangeRates(properties: Set<IExchangeRatesProperty>): IVarCus
    fun getExchangeRecords(): IValCurs
}