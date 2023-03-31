package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.*

interface IXMLExchangeRatesDeserializer<T> {
    fun deserialize(xml: String): T
}

interface IXMLExchangeDeserializer : IXMLExchangeRatesDeserializer<IVarCus>
interface IXMLRecordDeserializer : IXMLExchangeRatesDeserializer<IValCurs>


interface IHTTPExchangeRates<HTTPProperty : IHTTPProperty> {
    fun getXML(properties: Set<HTTPProperty>): String
}

interface IHTTPExchange : IHTTPExchangeRates<IExchangeHTTPProperty>
interface IHTTPRecord : IHTTPExchangeRates<IRecordHTTPProperty>

interface IExchangeRepository {
    fun getExchanges(properties: Set<IExchangeERProperty>): IVarCus
}
interface IRecordRepository {
    fun getRecords(exchange: IExchange, properties: Set<IRecordERProperty>): IValCurs
}


interface IExchangeRatesRepository {
    fun getExchange(properties: Set<IExchangeERProperty>): IVarCus
    fun getRecord(exchange: IExchange, properties: Set<IRecordERProperty>): IValCurs
}