package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IRecord {
    val date: LocalDate
    val id: String
    val nominal: Int
    val value: Float
}

interface IValCurs {
    val id: String
    val dateRange1: LocalDate
    val dateRange2: LocalDate
    val name: String
    val records: List<IRecord>
}


