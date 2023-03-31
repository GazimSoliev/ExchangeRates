package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IExchangeHTTPProperty

object HTTPExchange : IHTTPExchange, AHTTPExchangeRates<IExchangeHTTPProperty>() {
    override val link: String = "http://www.cbr.ru/scripts/XML_daily.asp"
}