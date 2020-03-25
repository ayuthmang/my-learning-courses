package week_2

enum class Color { BLUE, ORANGE, RED }

//fun updateWeather(degrees: Int) {
//    val description: String
//    val color: Color
//    if (degrees < 10) {
//        description = "cold"
//        color = Color.BLUE
//    } else if (degrees < 25) {
//        description = "mild"
//        color = Color.ORANGE
//    } else {
//        description = "hot"
//        color = Color.RED
//    }
//}

//fun updateWeather(degrees: Int) {
//    val (description: String, color: week_2.Color) =
//        if (degrees < 10) {
//            Pair("cold", Color.BLUE)
//        } else if (degrees < 25) {
//            Pair("mild", Color.ORANGE)
//        } else {
//            Pair("hot", Color.RED)
//        }
//}

fun updateWeather(degrees: Int) {
    val (description: String, color: week_2.Color) =
        when {
            degrees < 10 -> "cold" to Color.BLUE
            degrees < 25 -> "mild" to Color.ORANGE
            else -> "hot" to Color.RED
        }
}