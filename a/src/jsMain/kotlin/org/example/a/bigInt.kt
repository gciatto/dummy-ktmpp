package org.example.a

actual fun bigInt(number: Number): BigInt {
    return BigIntJs(Big(number))
}

actual fun bigInt(string: String): BigInt {
    return BigIntJs(Big(string))
}