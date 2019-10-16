package aquarius

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println(myAquarium.length)
    println(myAquarium.volume)
}