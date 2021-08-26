package org.example.b

import org.example.a.BigInt
import kotlin.js.JsExport

@JsExport
object BigIntUser {
    fun bigString(bigInt: BigInt): String {
        return bigInt.toString()
    }
}