package com.gazim.library.exchange_rates.model.record_models_impl

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.gazim.library.exchange_rates.model.IRecord
import com.gazim.library.exchange_rates.utils.ValueJsonDeserializer
import java.time.LocalDate

data class Record(
    @JsonProperty("Date")
    override val date: LocalDate,
    @JsonProperty("Id")
    override val id: String,
    @JsonProperty("Nominal")
    override val nominal: Int,
    @JsonDeserialize(using = ValueJsonDeserializer::class)
    @JsonProperty("Value")
    override val value: Float
) : IRecord
