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

interface IHTTPRecord : IHTTPExchangeRates<IExchangeHTTPProperty>


interface IExchangeRatesGetter<ERProperty : IExchangeRatesProperty, T> {
    fun get(properties: Set<ERProperty>): T
}

interface IExchangeGetter : IExchangeRatesGetter<IExchangeERProperty, IVarCus>
interface IRecordGetter : IExchangeRatesGetter<IRecordERProperty, IValCurs>


interface IExchangeRatesRepository {
    fun getExchange(properties: Set<IExchangeERProperty>): IVarCus
    fun getRecord(properties: Set<IRecordERProperty>): IValCurs
}