package com.gazim.library

import com.gazim.library.exchange_rates.model.exchange_er_property_models_impl.DateExcERProp
import com.gazim.library.exchange_rates.model.record_er_property_models.DateRangeRecERProp
import com.gazim.library.exchange_rates.repository.ExchangeRatesRepository
import com.gazim.library.exchange_rates.repository.RecordRepository
import java.time.LocalDate

fun main() {
    val exchanges =
        ExchangeRatesRepository
            .getExchange(setOf(DateExcERProp(date = LocalDate.now())))
    println(exchanges)
    println("Started")
    val exchange = RecordRepository.getRecords(
        exchanges.exchanges.first(),
        setOf(
            DateRangeRecERProp(
                endDate = LocalDate.now(),
                startDate = LocalDate.of(2000, 12, 1)
            )
        )
    )
    println(exchange)
}