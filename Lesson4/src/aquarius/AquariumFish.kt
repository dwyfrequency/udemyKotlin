package aquarius

// abstract classes can have constructors while interfaces cannot

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color: String = "grey"
    override fun eat() {
        println("Shark nom nom")

    }
}

class GoldFish: AquariumFish(), FishAction {
    override val color: String = "gold"
    override fun eat() {
        println("GoldFish nom nom")
    }
}

interface FishAction {
    fun eat()
}