package org.example.b

import org.example.a.A
import kotlin.js.JsExport

@JsExport
object B {
    fun jerkishGreet(string: String): String {
        return "${A.greet(string)}, you asshole"
    }
}