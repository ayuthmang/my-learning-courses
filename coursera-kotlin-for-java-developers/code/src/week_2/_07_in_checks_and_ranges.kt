package week_2


fun main() {
    /*** in: two use-cases ***/

    // iteration
    for (i in 'a'..'z') {
    }

    // check for belonging
    // c in 'a'..'z'


    /*** in a range ***/
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    // under the hood it'll generate: c in 'a'..'z' --> 'a' <= c && c <= 'Z'
    println(isLetter('q'))
    println(isLetter('*'))

    /*** not in a range ***/
    fun isNotDigit(c: Char) = c !in '0'..'9'

    /*** in as when-condition ***/
    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..."
    }
    recognize('$')

    /*** Different ranges ***/
    // 1..9                 // IntRange
    // 1 until 10           // IntRange
    // 'a'..'z'             // CharRange
    // "ab".."az"           // ClosedRange<String>
    // startDate..endDate   // ClosedRange<MyDate>

    // val intRange: IntRange = 1..9
    // val anotherIntRange = 1 until 10
    // val charRange: CharRange = 'a'..'z'
    // val stringRange: ClosedRange<String> = "ab".."az"
    // val dateRange: ClosedRange<MyDate> = startDate..endDate

    /*** Optimization for ranges ***/
    // Optimized. No extra IntRange or CharRange object are created
    // iteration over range of primitives
    //
    // for (i in 1..9)
    //     print(i)
    // or
    //
    // c in '0'..'9'

    // Quiz
    println("Kotlin" in "Java".."Scala")            // true
    println("Kotlin" in setOf("Java", "Scala"))     // false
    println("ball" in "a".."k")

    /*** Range of custom types ***/
    // class MyDate : Comparable<MyDate>

    // if (myDate.compareTo(startDate) >= 0 && myDate.compareTo(endDate) <= 0) {
    // }

    // no need to call compareTo
    // if (myDate >= startDate && myDate <= endDate) {
    // }

    // range check works with every comparable type
    // if (myDate in startDate..endDate) {
    // }

    /*** Belonging to collection ***/
    // if (element in list) {
    // }

    // the same as
    // if (list.contains(element)) {
    // }
}

