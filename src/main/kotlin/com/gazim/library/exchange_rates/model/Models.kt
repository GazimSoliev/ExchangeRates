package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IVarCus {
    val date: LocalDate
    val name: String
    val exchanges: List<IExchange>
}

interface IExchange {
    val id: String
    val numCode: String
    val charCode: String
    val nominal: Int
    val name: String
    val value: Float
}

interface IERProperty {
    val value: Any
}

interface IERDateProperty : IERProperty {
    override val value: LocalDate
}

interface IExchangeRatesProperty : IERProperty

interface IExchangeRatesDataProperty : IExchangeRatesProperty, IERDateProperty

interface IHTTPProperty : IERProperty {
    val key: String
    val valueStr: String
}

interface IDateHTTPProperty : IHTTPProperty, IERDateProperty