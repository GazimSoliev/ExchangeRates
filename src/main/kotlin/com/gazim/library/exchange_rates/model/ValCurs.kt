package com.gazim.library.exchange_rates.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate

data class ValCurs(
    @JsonProperty("ID")
    override val id: String,
    @JsonProperty("DateRange1")
    override val dateRange1: LocalDate,
    @JsonProperty("DateRange2")
    override val dateRange2: LocalDate,
    @JsonProperty("name")
    override val name: String,
    @JsonProperty("Record")
    override val records: List<IRecord>
) : IValCurs
