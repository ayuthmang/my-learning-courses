package week_3._02_Functional_Programming

data class Hero(
    val name: String,
    val age: Int,
    val gender: Gender?
)

enum class Gender { MALE, FEMALE }

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE)
    )

    // #9
    // val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }
    // val (age, group) = mapByAge.maxBy { (_, group) ->
    //     group.size
    // }!!
    // println(age) // 29

    // #10 associateBy
    // val mapByName: Map<String, Hero> =
        heroes.associateBy { it.name }
    // mapByName["Frenchy"]?.age // 42, nothing found? --> null
    // mapByName.getValue("Frenchy")?.age // 42, beware for NoSuchElementException

    // #11 map with associate
    val mapByName = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 0, null)
    mapByName.getOrElse("unknown") { unknownHero }.age

    // #12
    // val (first, second) = heroes
    //     .flatMap { heroes.map { hero -> it to hero } }
    //     .maxBy { it.first.age - it.second.age }!!
    // first.name

     val allPossiblePairs = heroes
         .flatMap { first ->
             heroes.map { second -> first to second}
         }
    println(allPossiblePairs)
    val (oldest, youngest) = allPossiblePairs
        .maxBy { it.first.age - it.second.age }!!
    println(oldest.name) // The Captain
    println(youngest.name) // The Kid
}