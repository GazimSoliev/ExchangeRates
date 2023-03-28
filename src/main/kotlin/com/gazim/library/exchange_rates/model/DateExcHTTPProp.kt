package com.gazim.library.exchange_rates.model

import java.time.LocalDate

data class DateExcHTTPProp(
    override val date: LocalDate,
    override val property: String,
    override val value: String
) : IDateExcHTTPProp
