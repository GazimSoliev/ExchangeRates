package com.gazim.library.exchange_rates.model

import java.time.LocalDate

data class StartDateRecHTTPProp(
    override val startDate: LocalDate,
    override val property: String,
    override val value: String
): IStartDateRecHTTPProp
