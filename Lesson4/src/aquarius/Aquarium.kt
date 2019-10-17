package aquarius

import kotlin.math.PI

//default constructor
// must add open to make it subclassable
open class Aquarium(var width: Int = 20,
               var height: Int = 40,
               var length: Int = 100) {

    open var volume: Int
        get() {return width * height * length / 1000}
        set(value) {height = (value * 1000)/ (width * height)}

    open var water = volume * 0.9

    // alternative constructor
    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000 // cm3
        val tank: Double = water *2 *0.1
        height = (tank / (length*width)).toInt()
    }
}

class TowerTank(): Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() {return (width * height * length / 1000 * PI).toInt()}
        set(value) {height = (value * 1000)/ (width * height)}

}