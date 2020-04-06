package week_2

fun main(args: Array<String>) {
    // if expression
    val name = if (args.size > 0) args[0] else "Kotlin"

    // string templates
    println("Hello, $name")

    // "...$variable..."
    // "...${functionCall(...)}..."

    // quiz
    // println("Hello, ${args.getOrNull(0)}!")


    // quiz 2

}