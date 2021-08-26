//@file:JsExport

package org.example.a

import kotlin.js.JsExport
import kotlin.js.JsName

@JsExport
interface BigInt {
    @JsName("plus")
    operator fun plus(other: BigInt): BigInt
}

@JsName("bigInt")
expect fun bigInt(number: Number): BigInt

@JsName("parseBigInt")
expect fun bigInt(string: String): BigInt
