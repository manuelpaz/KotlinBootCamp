package simplSpice

import Spices.Curry

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

    val spiceCabinet = listOf(SpiceContainer(Spice("curry", "mild")),
            SpiceContainer(Spice("green curry", "medium")),
            SpiceContainer(Spice("red curry", "medium")))
    for(element in spiceCabinet) println(element.label)
}
/*Practice Time
Create a simple data class, SpiceContainer, that holds one spice.
Give SpiceContainer a property, label, that is derived from the name of the spice.
Create some containers with spices and print out their labels.*/
data class SpiceContainer(val spice: Spice){
    val label = spice.name
}