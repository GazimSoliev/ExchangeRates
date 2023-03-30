package com.gazim.library.exchange_rates.repository

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.gazim.library.exchange_rates.model.ValCurs
import com.gazim.library.exchange_rates.model.VarCus

object XMLExchangeDeserializer : IXMLExchangeDeserializer {
    @Suppress("MemberVisibilityCanBePrivate")
    val xmlDeserializer = XmlMapper(JacksonXmlModule().apply {
        setDefaultUseWrapper(false)
    }).registerKotlinModule()

    override fun getVarCus(xml: String) =
        xmlDeserializer.readValue(xml, VarCus::class.java)!!

    override fun getValCurs(xml: String) =
        xmlDeserializer.readValue(xml, ValCurs::class.java)!!
}