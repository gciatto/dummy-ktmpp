package org.example.a

import java.math.BigInteger

class BigIntJvm(private val value: BigInteger) : BigInt {
    override fun plus(other: BigInt): BigInt {
        require(other is BigIntJvm)
        return BigIntJvm(value.plus(other.value))
    }

    override fun equals(other: Any?): Boolean {
        return other is BigIntJvm && value == other.value
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }

    override fun toString(): String {
        return value.toString()
    }
}