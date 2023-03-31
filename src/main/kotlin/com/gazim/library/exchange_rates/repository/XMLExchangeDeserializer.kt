package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IVarCus
import com.gazim.library.exchange_rates.model.exchange_models_impl.VarCus

object XMLExchangeDeserializer :
    IXMLExchangeDeserializer,
    AXMLExchangeRatesDeserializer<IVarCus, VarCus>(VarCus::class)