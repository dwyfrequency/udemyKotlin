package aquarius

fun main() {
    buildAquarium()
    fishGen()
    makeFish()
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

fun fishGen() {
    val fish = Fish(false, 20)
    val fish2 = Fish(true, 20)
    print("fish: ${fish.size}; fish2: ${fish2.size}")
}

fun makeFish() {
    val goldFish = GoldFish()
    val shark = Shark()
    feedFish(shark)
}

// by specifing the interface as the type, we can pass in anything that implements that interface
fun feedFish(fish: FishAction) {
    fish.eat()
}