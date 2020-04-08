package week_2

import java.lang.StringBuilder
import kotlin.math.abs

/*** Extensions Functions ***/
// fun String.lastChar() = this.get(this.length -1)
fun String.lastChar() = get(length - 1) // this can be omitted
// under the hood, it's just a regular static function

fun main() {
    val c: Char = "abc".lastChar()
    println(c)

    // Quiz 1
    "Repeat".repeat(123);


}

/*** Quiz 1 ***/
// How many arguments does the repeat function have if you call it from java
fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

/*** Quiz ***/
// Is it possible to call a private member of String inside an extension function to String?
// fun String.lastChar() = get(length - 1)

/*** Quiz 2 explain Accessing private members ***/
// - In Java you can't call a private member from a static function of another class
// - Kotlin extension functions are regular static functions defined in a separate auxiliary class
// - you can't call private members from extensions