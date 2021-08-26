package org.example.a

import java.math.BigInteger

actual fun bigInt(number: Number): BigInt {
    return BigIntJvm(BigInteger.valueOf(number.toLong()))
}

actual fun bigInt(string: String): BigInt {
    return BigIntJvm(BigInteger(string))
}