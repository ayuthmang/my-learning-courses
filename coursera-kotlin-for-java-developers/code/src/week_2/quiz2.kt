package week_2.week_2

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

fun main() {
    // not cache because function can return different value on each success
    // if want to cache just store in a variable manually
    println("First ${foo()}, second ${foo()}")
}