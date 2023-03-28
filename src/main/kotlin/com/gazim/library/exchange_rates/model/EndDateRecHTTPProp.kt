package com.gazim.library.exchange_rates.model

import java.time.LocalDate

data class EndDateRecHTTPProp(
    override val endDate: LocalDate,
    override val property: String,
    override val value: String
): IEndDateRecHTTPProp
