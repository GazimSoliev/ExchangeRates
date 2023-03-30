package com.gazim.library.exchange_rates.model.exchange_er_property_models_impl

import com.gazim.library.exchange_rates.model.IDateExcERProp
import java.time.LocalDate

data class DateExcERProp(override val date: LocalDate): IDateExcERProp
