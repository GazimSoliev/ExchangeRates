package com.gazim.libray.exchange_rates.repository

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.gazim.libray.exchange_rates.model.VarCus

object XMLExchangeRatesDeserializer : IXMLExchangeRatesDeserializer {
    val xmlDeserializer = XmlMapper(JacksonXmlModule().apply {
        setDefaultUseWrapper(false)
    }).registerKotlinModule()

    override fun getVarCus(xml: String) =
        xmlDeserializer.readValue(xml, VarCus::class.java)!!
}