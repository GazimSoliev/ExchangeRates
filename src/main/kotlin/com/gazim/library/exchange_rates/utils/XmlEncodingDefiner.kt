package com.gazim.library.exchange_rates.utils

object XmlEncodingDefiner {
    val regexXmlInfo = Regex("""<\?xml version="(.+)" encoding="(.*)"\?>""")
    fun define(xmlBytes: ByteArray) {

    }

}