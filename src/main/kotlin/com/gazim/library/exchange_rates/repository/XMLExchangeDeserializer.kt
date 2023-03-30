package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IVarCus
import com.gazim.library.exchange_rates.model.exchange_models_impl.VarCus
import com.gazim.library.exchange_rates.utils.xmlDeserializer

object XMLExchangeDeserializer : IXMLExchangeDeserializer {
    override fun deserialize(xml: String): IVarCus =
        xmlDeserializer.readValue(xml, VarCus::class.java)!!
}