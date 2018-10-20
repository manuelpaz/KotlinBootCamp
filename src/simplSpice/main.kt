package simplSpice

fun main(args: Array<String>){
    buildSimpleSpice()
}

fun buildSimpleSpice(){
    //val mySimpleSpice = simpleSpice()
    //println("Spice's name is ${mySimpleSpice.name} and the spiciness is ${mySimpleSpice.heat}")

    val listOfSpices = listOf(Spice("Curry", "mild"),
                              Spice("Pepper", "medium"),
                              Spice("Ginger", "mild"),
                              Spice("Cayenne", "spicy"),
                              Spice("Red curry", "medium"),
                              Spice("Green curry", "mild"),
                              Spice("Hot pepper", "extremely spicy"))

    val spice = Spice("Cayenne", "spicy")

    var lessThanSpicy = listOfSpices.filter { it.heat < 5 }
}