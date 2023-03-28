package com.gazim.library.exchange_rates.model

import java.time.LocalDate

data class DateRangeRecERProp(
    override val startDate: LocalDate,
    override val endDate: LocalDate
) : IDateRangeRecERProp
