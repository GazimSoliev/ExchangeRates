package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IExchangeERProperty: IExchangeRatesProperty
interface IDateExcERProp: IExchangeERProperty {
    val date: LocalDate
}