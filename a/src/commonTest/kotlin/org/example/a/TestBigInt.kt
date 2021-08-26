package org.example.a

import kotlin.test.Test
import kotlin.test.assertEquals

class TestBigInt {
    @Test
    fun testSum() {
        assertEquals(bigInt(3), bigInt(1) + bigInt(2))
    }
}
