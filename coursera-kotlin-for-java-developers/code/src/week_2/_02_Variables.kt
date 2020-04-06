package week_2

// Variables
// val: read-only
// var: mutable


// Local type interence
val greeting /*: String */ = "Hi!"
val number /*: Int */ = 0

fun main() {
    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")

    val readOnlyList = listOf("Java")
    // readOnlyList.add("Kotlin") // Read-only list lacks mutating methods
}