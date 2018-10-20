package Spices

fun main(args: Array<String>){
 delegate()
}

fun delegate(){
    val curry = Curry("Hot pepper", "medium")
    println("Curry's color: ${curry.color}")
}


// 1 .- Hacer una clase abstracta Spice
// Del punto 7 se tiene que agregar un parametro a la clase abstracta Spice y este es color de tipo SpiceColor
// 8 .- Agregar SpiceColor como una interface y dejar que sea por color
abstract  class Spice(val name: String, val spiciness: String = "mild",  color: SpiceColor ) : SpiceColor by color{
    // 3 .- Agregar un metodo abstracto prepareSpice e implentarlo en curry
    abstract fun prepareSpice()
}
// 2 .- Crear una subclase Curry
// 4.2 .- Agregar la interface Grinder a la clase Curry
// 7 .- Agregar una propiedad color a Curry de tipo SpiceColor y establecer el valor por defecto  a YellowSpiceColor
class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder{

    override fun grind() {

    }
    // 3.1 .- Implementación del metodo prepareSpice en Curry
    override fun prepareSpice() {
        // 4 .- LLamar a un metodo grind
        grind()
    }
}

// 4.1 .- Crear una interface Grinder que implemente el metodo grind
interface Grinder{
    fun grind()
}

// 5 .- Crear una interface SpiceColor que tiene una propiedad color se puede utilizar  un String para color
interface SpiceColor{
    val color: String
}

// 6 .- Crear una subclase singleton  YellowSpiceColor, usando la palabra object
object YellowSpiceColor: SpiceColor{
    override val color = "Yellow"
}