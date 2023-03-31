package com.gazim.library.exchange_rates.repository

import com.gazim.library.exchange_rates.model.*
import com.gazim.library.exchange_rates.model.record_http_property_models.EndDateRecHTTPProp
import com.gazim.library.exchange_rates.model.record_http_property_models.IDRecHTTPProp
import com.gazim.library.exchange_rates.model.record_http_property_models.StartDateRecHTTPProp

object RecordRepository : IRecordRepository {
    override fun getRecords(exchange: IExchange, properties: Set<IRecordERProperty>): IValCurs {
        val httpProperties = mutableSetOf<IRecordHTTPProperty>()
        properties.forEach {
            when (it) {
                is IDateRangeRecERProp -> {
                    httpProperties.add(
                        StartDateRecHTTPProp(
                            startDate = it.startDate
                        )
                    )
                    httpProperties.add(
                        EndDateRecHTTPProp(
                            endDate = it.endDate
                        )
                    )
                }

                else -> throw Exception()
            }
        }
        httpProperties.add(IDRecHTTPProp(id = exchange.id))
        val xml = HTTPRecord.getXML(httpProperties)
        return XMLRecordDeserializer.deserialize(xml)
    }
}