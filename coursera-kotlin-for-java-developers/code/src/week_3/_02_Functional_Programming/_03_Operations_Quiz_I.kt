package week_3._02_Functional_Programming

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )

    // #1
    heroes.last().name

    // #2
    heroes.firstOrNull { it.age == 30 }?.name

    // #3
    heroes.map { it.age }.distinct().size

    // #4
    heroes.filter { it.age < 30 }.size

    // #5
    val (youngest, oldest) = heroes.partition { it.age < 30 }
    oldest.size

    // #6
    heroes.maxBy { it.age }?.name

    // #7
    heroes.all { it.age < 50 }

    // #8
    heroes.any { it.gender == Gender.FEMALE }
}