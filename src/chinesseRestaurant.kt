fun main(args: Array<String>){

    //print("\nYour fortune is:  ${getFortuneCookie()}")
    var fortune : String = ""
    /*
    for (i in 1..10){
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is:  $fortune")
        if (fortune.contains("Take it easy")) break
    }
    */

    /*
    repeat(10){
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is:  $fortune")
        if (fortune.contains("Take it easy"))
    }
    */

    while(!fortune.contains("Take it easy")){
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is:  $fortune")
    }

}

fun getFortuneCookie(birthDay : Int): String{
    val listOfCookiesFortune = listOf<String>("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune")

    return when(birthDay){
        in 28..31 -> "You will have a great day!"
        in 1..7 -> "Be humble and all will turn out well."
        else -> listOfCookiesFortune[birthDay.rem(listOfCookiesFortune.size)]
     }
}
/*
Use the code you created in the last practice, or copy the starter code from below.

The getFortune() function should really only be getting the fortune, and not be in the business of getting the birthday.

Change your Fortune Cookie program as follows:

Create a function called getBirthday() that gets the birthday from the user.
Pass the result of getBirthday() to getFortune() using an Integer argument, and use it to return the correct fortune.
Remove getting the birthday from getFortune()
Instead of calculating the fortune based on the birthday, use a when statement to assign some fortunes as follows (or use your own conditions):
If the birthday is 28 or 31...
If the birthday is in the first week…
else … return the calculated fortune as before.
Hint: There are several ways in which to make this when statement. How much can you Kotlinize it?
*/
fun getBirthday() : Int{
    print("\nEnter your birthay")
    return  readLine()?.toIntOrNull()?:1
}