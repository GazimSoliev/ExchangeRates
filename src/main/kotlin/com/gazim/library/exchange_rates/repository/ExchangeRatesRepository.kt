package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.*

object ExchangeRatesRepository : IExchangeRatesRepository {
    override fun getExchange(properties: Set<IExchangeERProperty>): IVarCus =
        ExchangeRepository.getExchanges(properties)
    override fun getRecord(exchange: IExchange, properties: Set<IRecordERProperty>): IValCurs =
        RecordRepository.getRecords(exchange, properties)
}