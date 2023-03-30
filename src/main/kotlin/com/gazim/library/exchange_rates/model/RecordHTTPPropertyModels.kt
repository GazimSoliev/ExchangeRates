package com.gazim.library.exchange_rates.model

import java.time.LocalDate

interface IRecordHTTPProperty : IHTTPProperty

interface IStartDateRecHTTPProp : IRecordHTTPProperty {
    val startDate: LocalDate
}

interface IEndDateRecHTTPProp : IRecordHTTPProperty {
    val endDate: LocalDate
}

interface IIDRecHTTPProp : IRecordHTTPProperty {
    val id: String
}