package com.gazim.library.exchange_rates.utils

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.time.format.DateTimeFormatter

internal val xmlDeserializer = XmlMapper(JacksonXmlModule().apply {
    setDefaultUseWrapper(false)
}).registerKotlinModule()

internal val httpPropDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")