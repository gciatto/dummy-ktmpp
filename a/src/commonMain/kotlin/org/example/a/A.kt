package org.example.a

import kotlin.js.JsExport

@JsExport
object A {
    fun greet(text: String): String {
        return "Hello $text"
    }
}