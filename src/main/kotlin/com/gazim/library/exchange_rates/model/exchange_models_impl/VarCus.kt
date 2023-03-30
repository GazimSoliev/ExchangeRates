package com.gazim.library.exchange_rates.model.exchange_models_impl

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.gazim.library.exchange_rates.model.IVarCus
import com.gazim.library.exchange_rates.utils.DateJsonDeserializer
import java.time.LocalDate

data class VarCus(
    @JsonDeserialize(using = DateJsonDeserializer::class)
    @JsonProperty("Date")
    override val date: LocalDate,
    @JsonProperty("name")
    override val name: String,
    @JsonProperty("Valute")
    override val exchanges: List<Exchange>
) : IVarCus

