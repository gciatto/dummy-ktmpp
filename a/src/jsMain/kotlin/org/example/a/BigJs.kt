@file:JsModule("big.js")
@file:JsNonModule

package org.example.a

external class Big {
    constructor(number: Number)
    constructor(string: String)
    constructor(other: Big)

    fun plus(other: Big): Big

    fun eq(other: Big): Boolean
}