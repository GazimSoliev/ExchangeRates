package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IValCurs
import com.gazim.library.exchange_rates.model.record_models_impl.ValCurs
import com.gazim.library.exchange_rates.utils.xmlDeserializer

object XMLRecordDeserializer : IXMLRecordDeserializer {
    override fun deserialize(xml: String): IValCurs =
        xmlDeserializer.readValue(xml, ValCurs::class.java)!!
}