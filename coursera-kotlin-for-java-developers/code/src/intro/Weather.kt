package intro

enum class Color { BLUE, ORANGE, RED }

//fun intro.updateWeather(degrees: Int) {
//    val description: String
//    val color: intro.Color
//    if (degrees < 10) {
//        description = "cold"
//        color = intro.Color.BLUE
//    } else if (degrees < 25) {
//        description = "mild"
//        color = intro.Color.ORANGE
//    } else {
//        description = "hot"
//        color = intro.Color.RED
//    }
//}

//fun intro.updateWeather(degrees: Int) {
//    val (description: String, color: intro.Color) =
//        if (degrees < 10) {
//            Pair("cold", intro.Color.BLUE)
//        } else if (degrees < 25) {
//            Pair("mild", intro.Color.ORANGE)
//        } else {
//            Pair("hot", intro.Color.RED)
//        }
//}

fun updateWeather(degrees: Int) {
    val (description: String, color: Color) =
        when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mild" to Color.ORANGE
            else -> "hot" to Color.RED
        }
}