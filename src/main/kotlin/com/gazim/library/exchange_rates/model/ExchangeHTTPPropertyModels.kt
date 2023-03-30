package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IExchangeHTTPProperty: IHTTPProperty

interface IDateExcHTTPProp: IExchangeHTTPProperty {
    val date: LocalDate
}