package org.example.a

class BigIntJs(private val value: Big) : BigInt {
    override fun plus(other: BigInt): BigInt {
        require(other is BigIntJs)
        return BigIntJs(value.plus(other.value))
    }

    override fun equals(other: Any?): Boolean {
        return other is BigIntJs && this.value.eq(other.value)
    }

    override fun hashCode(): Int {
        return toString().hashCode()
    }

    override fun toString(): String {
        return value.toString()
    }
}