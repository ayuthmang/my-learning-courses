package week_2

/***
 * Checking identifier
 * Implement the function that checks whether a string is a valid identifier. A valid identifier is a non-empty string
 * that starts with a letter or underscore and consists of only letters, digits and underscores.
 ***/

fun isValidIdentifier(s: String): Boolean {
    // check if not an empty string
    if (s.isEmpty())
        return false

    // check first letter that starts with a letter or underscore and
    val firstLetter = s.first().toString()
    if (firstLetter !in "a".."z" && firstLetter !in "A".."Z" && firstLetter !in "_") {
        return false
    }

    // the rest consists of only letters, digits and underscores
    val theRest = s.slice(1 until s.length).split("")
    for (c in theRest) {
        if (c !in "a".."z" && c !in "A".."Z" && c !in "_" && c !in "0".."9") {
            return false
        }
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}