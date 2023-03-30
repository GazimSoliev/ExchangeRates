package com.gazim.library.exchange_rates.model.record_er_property_models

import com.gazim.library.exchange_rates.model.IDateRangeRecERProp
import java.time.LocalDate

data class DateRangeRecERProp(
    override val startDate: LocalDate,
    override val endDate: LocalDate
) : IDateRangeRecERProp
