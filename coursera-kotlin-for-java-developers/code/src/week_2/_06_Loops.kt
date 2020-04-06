package week_2

fun main() {

    /*** for loop ***/
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }
    println()

    /*** Iterating over map ***/
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    for ((key, value) in map) {
        println("$key = $value")
    }

    /*** Iterating with index ***/
    val list2 = listOf("a", "b", "c")
    for ((index, element) in list2.withIndex()) {
        println("$index: $element")
    }

    /*** Iterating over range ***/
    for (i in 1..9) {
        print(i)
    }
    println()

    for (i in 1 until 9) {
        print(i)
    }
    println()

    /*** Iterating with a step ***/
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()

    /*** Iterating over String ***/
    for (ch in "abc")
        print(ch + 1)
    println()

    // Quiz
    for (c in '0' until '9')
        print(c)
    println()
}