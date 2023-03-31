package com.gazim.library.exchange_rates.model.record_models_impl

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.gazim.library.exchange_rates.model.IValCurs
import com.gazim.library.exchange_rates.utils.DateJsonDeserializer
import java.time.LocalDate

data class ValCurs(
    @JsonProperty("ID")
    override val id: String,
    @JsonDeserialize(using = DateJsonDeserializer::class)
    @JsonProperty("DateRange1")
    override val dateRange1: LocalDate,
    @JsonDeserialize(using = DateJsonDeserializer::class)
    @JsonProperty("DateRange2")
    override val dateRange2: LocalDate,
    @JsonProperty("name")
    override val name: String,
    @JsonProperty("Record")
    override val records: List<Record>
) : IValCurs
