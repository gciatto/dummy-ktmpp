package org.example.a

import kotlin.test.Test
import kotlin.test.assertEquals

class TestA {
    @Test
    fun testGreet() {
        assertEquals("Hello gciatto", A.greet("gciatto"))
    }
}
