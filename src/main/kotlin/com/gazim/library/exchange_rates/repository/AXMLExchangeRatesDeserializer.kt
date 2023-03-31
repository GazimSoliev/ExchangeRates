package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.utils.xmlDeserializer
import kotlin.reflect.KClass

abstract class AXMLExchangeRatesDeserializer<I: Any, C : I>(
    private val clazz: KClass<C>
) : IXMLExchangeRatesDeserializer<I> {
    override fun deserialize(xml: String): I =
        xmlDeserializer.readValue(xml, clazz.java)
}