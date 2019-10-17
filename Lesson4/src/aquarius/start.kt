package aquarius

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println(myAquarium.length)
    println(myAquarium.volume)
    myAquarium.volume = 0
    println(myAquarium.volume)

    val newAquarium = Aquarium(14)
    println("water: ${newAquarium.water}; length: ${newAquarium 
        .length}")
}