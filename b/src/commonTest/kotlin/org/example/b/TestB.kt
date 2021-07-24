package org.example.b

import kotlin.test.Test
import kotlin.test.assertEquals

class TestB {
    @Test
    fun testJerkishGreet() {
        assertEquals("Hello gciatto, you asshole", B.jerkishGreet("gciatto"));
    }
}