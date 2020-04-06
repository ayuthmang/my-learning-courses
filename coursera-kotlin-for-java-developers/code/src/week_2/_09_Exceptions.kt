package week_2

import java.io.IOException
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

@Throws(IOException::class)
fun bar() {
    throw IOException();
}

fun main() {
    /*** throw is an expression ***/
    val percentage = if (number in 0..100)
        number
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")


    /*** try is an expression ***/
    var string = "a12"
    val number = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        return
        // null
    }
    println(number)
    doo()
}

fun doo() { throw IOException() }