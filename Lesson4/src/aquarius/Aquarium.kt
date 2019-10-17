package aquarius

//default constructor
class Aquarium(var width: Int = 20,
               var height: Int = 40,
               var length: Int = 100) {

    var volume: Int
        get() {return width * height * length / 1000}
        set(value) {height = (value * 1000)/ (width * height)}

    var water = volume * 0.9

    // alternative constructor
    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000 // cm3
        val tank: Double = water *2 *0.1
        height = (tank / (length*width)).toInt()
    }
}