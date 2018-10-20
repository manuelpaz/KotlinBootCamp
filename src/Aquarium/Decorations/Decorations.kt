package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations() {
// 1.1
    val d1 = Decorations("granite")
    println(d1)

    // 2.- Creamos dos mas decoraciones en makeDecorations d2 con "slate" y d3 también con "slate"
    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    // 3.- Agregamos dos instruncciones println que compare d1 con d2 y d2 con d3
    println(d1.equals(d2)) // Esto imprimira false
    println(d2.equals(d3)) // Esto imprimira true

    // 4.- Se pueden copiar data objects utilizando el metodo copy esto crea un nuevo objeto con los mismos valores de las propiedades

    val d4: Decorations = d3.copy()
    println(d3) //Esto imprimira Decorations(rocks = slate)
    println(d4) //Esto imprimira Decorations(rocks = slate)

    // 5.1 .- Y creamos una instancia (una decoración) con esta
    val d5 = Decorations2("crystal", "wood", "diver")
    println(d5)

    // 6.- Par obtener todas las propiedades y asignarlas a variables Kotlin nos permite usar un proceso llamado decomposition.
    //Podemos hacer tres variables una para cada propiedad y asignarle el objetos a estas Kotlin pone el valor de la propiedad en cada variable y entonces
    //se pueda usar

    val(rock: kotlin.String, wood: kotlin.String, diver: kotlin.String) = d5
    println(rock) // Imprimira crystal
    println(wood) // Imprimira wood
    println(diver) // Imprimira diver
}

// A menudo tenemos clase que principalmente actuan como contenedores de datos. En Kotlin, para las clases que principalmente almacenan datos hay una clase
//llamada data class con beneficios. Se agrego un package dentrode Aquarium llamado Decorations y en este un archivo llamado también Decorations que es en el que nos
//encontramos se ha creado una función main y una función makeDecorations

// 1.- Creamos una data class Decorations que sepa acerca de decoraciones de acuarios se puede entonces crear una instancia de esta clase en makeDecorations e imprimir
//todas sus propiedades

data class Decorations(val rocks: String){}

//5.- Hagamos un data class con algunas otras decoraciones la llamaremos Decorations2 y le agregaremos wood y diver
data class Decorations2(val rocks: String, val wood: String, val diver: String){}