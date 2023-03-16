package com.gazim.libray.exchange_rates.model

import java.time.LocalDate

data class ExchangeRatesDataProperty(
    override val value: LocalDate
) : IExchangeRatesDataProperty