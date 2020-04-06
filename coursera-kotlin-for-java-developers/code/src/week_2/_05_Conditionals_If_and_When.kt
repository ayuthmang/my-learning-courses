package week_2

import week_2.Color.*

enum class Color {
    BLUE, ORANGE, RED, YELLOW, VIOLET, GREEN, INDIGO
}

fun main() {
    /*** if is an expression ***/
    // val max = if (a > b) a else b

    /*** No ternary operator in Kotlin ***/
    // (a > b) ? a : b

    /*** Checking Values ***/
    fun respondToInput(input: String) = when (input) {
        "y", "yes" -> "I'm glas you agree"
        "n", "no" -> "Sorry to hear that"
        else -> "I don't understand you"
    }

    /*** Any expression can be used as a branch condition ***/
    fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

    print(mix(YELLOW, RED))

    /*** Checking types ***/
    // when (pet) {
    //     is /*** instance of ***/ Cat -> /*** smart casts ***/ pet.meow()
    //     is /*** instance of ***/ Dog -> /*** smart casts ***/ pet.woof()
    // }

    /*** Capturing when subject in a variable ***/
    // val pet = getMyFavouritePet()
    // when (pet) { // or when (val pet = getMyFavouritePet()) // starting from Kotlin 1.3
    //     is Cat -> pet.meow()
    //     is Dog -> pet.woof()
    // }

    /*** Checking conditions when without argument ***/
    // fun updateWeather(degrees: Int) {
    //     val (description, colour) = when {
    //         degrees < 5 -> "cold" to BLUE
    //         degrees < 23 -> "mild" to ORANGE
    //         else -> "hot" to RED
    //     }
    // }
}

