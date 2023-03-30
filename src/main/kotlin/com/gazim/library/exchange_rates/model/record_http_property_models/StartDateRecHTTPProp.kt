package com.gazim.library.exchange_rates.model.record_http_property_models

import com.gazim.library.exchange_rates.model.IStartDateRecHTTPProp
import java.time.LocalDate

data class StartDateRecHTTPProp(
    override val startDate: LocalDate,
    override val property: String,
    override val value: String
): IStartDateRecHTTPProp