package com.gazim.library.exchange_rates.model

import java.time.LocalDate

data class ExchangeRatesDataProperty(
    override val value: LocalDate
) : IExchangeRatesDataProperty