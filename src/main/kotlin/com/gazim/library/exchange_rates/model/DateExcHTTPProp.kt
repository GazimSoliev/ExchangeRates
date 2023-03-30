package com.gazim.library.exchange_rates.model

import java.time.LocalDate
import java.time.format.DateTimeFormatter

data class DateExcHTTPProp(
    override val date: LocalDate = LocalDate.now(),
    override val property: String = "date_req",
    override val value: String = date.format(dateFormat)
) : IDateExcHTTPProp {
    companion object {
        val dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    }
}
