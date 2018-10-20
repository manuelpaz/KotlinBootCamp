import java.util.*

//
//Create a new Kotlin file.
//Copy and paste the main() function from Hello World into the file.
//Create a new function, dayOfWeek().
//In the body of the function, print "What day is it today?"
//Call dayOfWeek() from main().
//Run your program.

fun main(args: Array<String>){
    //dayOfWeek()
    //feedTheFish()
    //canAddFish(10, listOf(3,3,3))
    //canAddFish(8, listOf(2,2,2), hasDescorations = false)
    //canAddFish(9, listOf(1,1,3),3)
    canAddFish(10.0, listOf(),7,true)
    eagerExample()

}


fun eagerExample(){
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowe pot")
    val eager = decorations.filter { it[0] == 'p' }
    println(eager)


}

fun dayOfWeek() {

    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

/*fun canAddFish(
    tankSise: Int,
    currentFish: List<Int>,
    fishSize: Int=2,
    hasDescorations: Boolean = true
): Boolean{
   var response = false

    var totalFishSize = fishSize
    for(item in currentFish) {
       totalFishSize =  totalFishSize.plus(item)
    }

   if (hasDescorations){
       response = totalFishSize <= 0.8*tankSise
   }else{
       response = totalFishSize <= tankSise
   }
    return response
}*/
fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean{
    return true
}

fun shouldChangeWater2(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20
){
}

fun feedTheFish(){
    val day = randomDay()
    val food = fisFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, temperature=20, dirty=50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty=50)
    shouldChangeWater2(day="Monday")
    if(shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun swim(speed: String = "fast"){
    println("swimming $speed")
}
fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
fun fisFood (day : String) : String{
    return  when(day){
        "Sunday"->"plankton"
        "Monday"->"flakes"
        "Tuesday"->"pellets"
        "Wednesday"->"redworms"
        "Thursday"->"granules"
        "Friday"->"mosquitos"
        "Saturday"->"lettuce"
            else -> "fasting"
    }
}