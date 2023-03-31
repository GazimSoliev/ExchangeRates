package com.gazim.library.exchange_rates.model.exchange_http_property_models_impl

import com.gazim.library.exchange_rates.model.IDateExcHTTPProp
import com.gazim.library.exchange_rates.utils.httpPropDateFormat
import java.time.LocalDate

data class DateExcHTTPProp(
    override val date: LocalDate = LocalDate.now(),
    override val property: String = "date_req",
    override val value: String = date.format(httpPropDateFormat)
) : IDateExcHTTPProp
