package com.gazim.library.exchange_rates.model.record_http_property_models

import com.gazim.library.exchange_rates.model.IIDRecHTTPProp

data class IDRecHTTPProp(
    override val id: String,
    override val property: String,
    override val value: String
) : IIDRecHTTPProp
