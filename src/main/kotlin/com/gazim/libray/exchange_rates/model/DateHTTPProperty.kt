package com.gazim.libray.exchange_rates.model

import java.time.LocalDate

data class DateHTTPProperty(
    override val value: LocalDate,
    override val key: String = "date_req"
) : IDateHTTPProperty {
    override val valueStr: String
        get() = value.run {
            val format = { str: Int -> "%02d".format(str) }
            "${format(dayOfMonth)}/${format(monthValue)}/$year"
        }
}