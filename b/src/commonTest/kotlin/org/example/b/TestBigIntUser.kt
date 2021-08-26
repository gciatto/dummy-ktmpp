package org.example.b

import org.example.a.bigInt
import kotlin.test.Test
import kotlin.test.assertEquals

class TestBigIntUser {
    @Test
    fun testBigIntUser() {
        val num = "123456789987654321"
        assertEquals(
            num,
            BigIntUser.bigString(bigInt(num))
        );
    }
}