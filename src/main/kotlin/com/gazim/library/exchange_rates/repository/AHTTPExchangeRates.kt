package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IHTTPProperty
import java.net.URL
import java.nio.charset.Charset

abstract class AHTTPExchangeRates<HTTPProperty : IHTTPProperty> : IHTTPExchangeRates<HTTPProperty> {
    abstract val link: String
    @Suppress("MemberVisibilityCanBePrivate")
    val regexXmlInfo = Regex("""<\?xml version="(.+)" encoding="(.*)"\?>""")

    override fun getXML(properties: Set<HTTPProperty>): String {
        val currentUrl = link + getHTTPProperties(properties)
        val url = URL(currentUrl)
        val bytes = url.readBytes()
        val encoding = getEncoding(String(bytes))
        return String(bytes, Charset.forName(encoding)).replace(regexXmlInfo, "")
    }

    private fun getHTTPProperties(properties: Set<HTTPProperty>): String =
        properties.joinToString(separator = "&", prefix = "?") {
            "${it.property}=${it.value}"
        }

    private fun getEncoding(str: String): String =
        regexXmlInfo.find(str)!!.groupValues.last()
}