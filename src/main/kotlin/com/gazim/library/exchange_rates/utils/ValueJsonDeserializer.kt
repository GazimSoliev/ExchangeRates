package com.gazim.library.exchange_rates.utils

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer

object ValueJsonDeserializer : JsonDeserializer<Float>() {
    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): Float? = strToFloat(p!!.text)!!
    @Suppress("MemberVisibilityCanBePrivate")
    fun strToFloat(str: String): Float? = str.replace(',', '.').toFloatOrNull()
}

