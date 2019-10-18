package aquarius

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color: String = "grey"
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class GoldFish: AquariumFish(), FishAction {
    override val color: String = "gold"
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface FishAction {
    fun eat()
}