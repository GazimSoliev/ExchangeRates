package com.gazim.library.exchange_rates.model

data class IDRecHTTPProp(
    override val id: String,
    override val property: String,
    override val value: String
) : IIDRecHTTPProp
