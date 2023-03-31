package com.gazim.library.exchange_rates.model.record_http_property_models

import com.gazim.library.exchange_rates.model.IStartDateRecHTTPProp
import com.gazim.library.exchange_rates.utils.httpPropDateFormat
import java.time.LocalDate

data class StartDateRecHTTPProp(
    override val startDate: LocalDate,
    override val property: String = "date_req1",
    override val value: String = startDate.format(httpPropDateFormat)
): IStartDateRecHTTPProp
