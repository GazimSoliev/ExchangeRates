package com.gazim.library.exchange_rates.model.record_http_property_models

import com.gazim.library.exchange_rates.model.IEndDateRecHTTPProp
import com.gazim.library.exchange_rates.utils.httpPropDateFormat
import java.time.LocalDate

data class EndDateRecHTTPProp(
    override val endDate: LocalDate,
    override val property: String = "date_req2",
    override val value: String = endDate.format(httpPropDateFormat)
): IEndDateRecHTTPProp
