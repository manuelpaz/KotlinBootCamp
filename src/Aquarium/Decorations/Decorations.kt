package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations(){
// 1.1
    val d1 = Decorations("granite")
    println(d1)
}

// A menudo tenemos clase que principalmente actuan como contenedores de datos. En Kotlin, para las clases que principalmente almacenan datos hay una clase
//llamada data class con beneficios. Se agrego un package dentrode Aquarium llamado Decorations y en este un archivo llamado también Decorations que es en el que nos
//encontramos se ha creado una función main y una función makeDecorations

// 1.- Creamos una data class Decorations que sepa acerca de decoraciones de acuarios se puede entonces crear una instancia de esta clase en makeDecorations e imprimir
//todas sus propiedades

data class Decorations(val rocks: String){}