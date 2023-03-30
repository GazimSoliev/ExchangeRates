package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IExchangeHTTPProperty
import java.net.URL
import java.nio.charset.Charset

object HTTPExchangeRates : IHTTPExchange {
    val link = "http://www.cbr.ru/scripts/XML_daily.asp"
    val regexXmlInfo = Regex("""<\?xml version="(.+)" encoding="(.*)"\?>""")

    override fun getXML(properties: Set<IExchangeHTTPProperty>): String {
        val currentUrl = link + getHTTPProperties(properties)
        val url = URL(currentUrl)
        val bytes = url.readBytes()
        val encoding = getEncoding(String(bytes))
        return String(bytes, Charset.forName(encoding)).replace(regexXmlInfo, "")
    }

    fun getHTTPProperties(properties: Set<IExchangeHTTPProperty>): String =
        properties.joinToString(separator = "&", prefix = "?") {
            "${it.property}=${it.value}"
        }

    fun getEncoding(str: String): String =
        regexXmlInfo.find(str)!!.groupValues.last()
}