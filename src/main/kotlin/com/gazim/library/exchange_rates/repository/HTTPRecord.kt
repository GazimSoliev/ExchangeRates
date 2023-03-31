package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.IRecordHTTPProperty

object HTTPRecord: IHTTPRecord, AHTTPExchangeRates<IRecordHTTPProperty>() {
    override val link: String = "http://www.cbr.ru/scripts/XML_dynamic.asp"
}