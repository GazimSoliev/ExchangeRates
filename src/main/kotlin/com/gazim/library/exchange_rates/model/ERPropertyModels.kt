package com.gazim.library.exchange_rates.model

interface IERProperty

interface IExchangeRatesProperty : IERProperty

interface IHTTPProperty : IERProperty {
    val property: String
    val value: String
}