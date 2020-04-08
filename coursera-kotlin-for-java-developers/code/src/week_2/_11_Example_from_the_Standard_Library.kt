package week_2

fun main(args: Array<String>) {
    /*** Standard collections ***/
    val set = hashSetOf(1, 7, 5)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)      // class java.util.HashSet
    println(list.javaClass)     // class java.util.ArrayList
    println(map.javaClass)      // class java.util.HashMap

    /*** Kotlin library: extensions on collections ***/
    // - No Kotlin SDK ... just JDK + extensions
    // - small runtime jar, easy java interop

    list.max()      // filter,  count   flatMap
                    // map,     find,   groupBy
                    // reduce,  any,    ...

    /*** Examples ***/

    /*** Extension function: joinToString ***/
    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))

    /*** Extension function: getOrNull ***/
    println("Hello, ${args.getOrNull(0)}!")

    val list2 = listOf("abc")
    println(list2.getOrNull(0))
    println(list2.getOrNull(1))

    /*** Extension function: withIndex() ***/
    val list3 = listOf("a", "b", "c")
    for ((index, element) in list.withIndex()) {
        println("$index $element")
    }

    /*** Extension function: until ***/
    // infix fun Int.until(to: Int): IntRange
    1.until(10)
    1 until 10  // call in a infix form by omitting dot or parentheses

    /*** Extension function: to ***/
    // infix fun <A, B> A.to(that: B) = Pair(this, that)
    "ANSWER".to(42)
    "hot" to "RED"
    mapOf(0 to "zero", 1 to "one")

    /*** Extension function on Char ***/
    // fun Char.isLetter() = this in 'a'..'z' || this in 'A'..'Z'
    // fun Char.isLetterOrDigit() = isLetter() || this in '0'..'9'
    'a'.isLetter()          // true
    '%'.isLetterOrDigit()   // false

    /*** Extension on String ***/

    // Formatting multiline strings
    val q = """To code
        |or not to code?..""".trimMargin(/*** marginPrefix = "|" ***/)

    val a = """
        Keep calm
        and learn Kotlin""".trimIndent()

    println(q)  // To code
                // or not to code?..

    println(a)  // Keep calm
                // and learn Kotlin

    /*** Using regular expressions ***/
    // val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    val regex =  """\d{2}\.\d{2}\.\d{4}""".toRegex()  // becomes shorter

    println(regex.matches("15.02.2016"))    // true
    println(regex.matches("15.02.16"))      // false

    /*** Conversion to numbers ***/
    println("123".toInt())       // 123
    println("1e-10".toDouble())  // 1.0E-10

    // println("xx".toInt())        // NumberFormatException

    println("123".toIntOrNull())
    println("xx".toIntOrNull())


    /*** Extension used for tasks in this course ***/
    infix fun<T> T.eq (other: T) {
        if (this == other) println("OK")
        else println("Error: $this != $other")
    }
    // Extension function: eq
    fun getAnswer() = 42

    getAnswer() eq 42   // OK
    getAnswer() eq 43   // Error: 42 != 43

    /*** Quiz ***/
    // What is the type of 'a'. to 1.0?
    // answer: Pair<Char, Double>
}