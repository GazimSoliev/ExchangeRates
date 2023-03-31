package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IValCurs
import com.gazim.library.exchange_rates.model.record_models_impl.ValCurs

object XMLRecordDeserializer :
    IXMLRecordDeserializer,
    AXMLExchangeRatesDeserializer<IValCurs, ValCurs>(ValCurs::class)