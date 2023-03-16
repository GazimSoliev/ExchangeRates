package com.gazim.libray.exchange_rates.utils

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import java.time.LocalDate

object DateJsonDeserializer : JsonDeserializer<LocalDate>() {
    val regexDate = Regex("""(\d{1,2})\.(\d{1,2})\.(\d+)""")

    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): LocalDate =
        strDateToLocalDate(p!!.text)!!

    fun strDateToLocalDate(str: String): LocalDate? =
        regexDate.find(str)?.groupValues?.run {
            LocalDate.of(
                component4().toInt(),
                component3().toInt(),
                component2().toInt()
            )
        }
}