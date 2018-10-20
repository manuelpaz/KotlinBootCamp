fun main(args: Array<String>){
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday("sad", temperature = 45))
    println("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isHappyAndSunny(mood1: String, weather1: String) = mood1 == "happy" && weather1 == "sunny"
fun isHungryAndCloudy(mood1: String, weather1: String) = mood1 == "hungry" && weather1 == "cloudy"
fun isSadAndRainy(mood1: String, weather1: String, temperature1: Int) = mood1 == "sad" && weather1 == "rainy" && temperature1 ==0
fun isVeryHot(temperature1: Int) = temperature1 > 35

fun whatShouldIDoToday(mood: String , weather: String = "sunny", temperature: Int = 24): String{
    return when{
        isHappyAndSunny(mood, weather) -> "go for a walk"
        isHungryAndCloudy(mood, weather) -> "go for pizza"
        isSadAndRainy(mood, weather, temperature)-> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        else -> "Stay home and read"
    }
}
