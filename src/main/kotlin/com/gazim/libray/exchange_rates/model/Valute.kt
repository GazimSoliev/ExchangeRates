package com.gazim.libray.exchange_rates.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.gazim.libray.exchange_rates.utils.ValueJsonDeserializer

data class Valute(
    @JsonProperty("ID")
    override val id: String,
    @JsonProperty("NumCode")
    override val numCode: String,
    @JsonProperty("CharCode")
    override val charCode: String,
    @JsonProperty("Nominal")
    override val nominal: Int,
    @JsonProperty("Name")
    override val name: String,
    @JsonDeserialize(using = ValueJsonDeserializer::class)
    @JsonProperty("Value")
    override val value: Float
) : IValute