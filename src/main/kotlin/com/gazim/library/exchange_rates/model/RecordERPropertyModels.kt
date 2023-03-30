package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IRecordERProperty : IExchangeRatesProperty

interface IDateRangeRecERProp : IRecordERProperty {
    val startDate: LocalDate
    val endDate: LocalDate
}