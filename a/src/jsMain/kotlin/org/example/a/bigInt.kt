package org.example.a

@Suppress("NON_EXPORTABLE_TYPE")
@JsExport
actual fun bigInt(number: Number): BigInt {
    return BigIntJs(Big(number))
}

@JsExport
@JsName("parseBigInt")
actual fun bigInt(string: String): BigInt {
    return BigIntJs(Big(string))
}