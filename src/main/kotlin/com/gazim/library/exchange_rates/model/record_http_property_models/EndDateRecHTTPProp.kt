package com.gazim.library.exchange_rates.model.record_http_property_models

import com.gazim.library.exchange_rates.model.IEndDateRecHTTPProp
import java.time.LocalDate

data class EndDateRecHTTPProp(
    override val endDate: LocalDate,
    override val property: String,
    override val value: String
): IEndDateRecHTTPProp
