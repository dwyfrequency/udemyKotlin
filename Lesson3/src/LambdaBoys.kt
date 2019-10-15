fun main(args: Array<String>) {
    println("We ballin boy")
    dirtyProcessor()
}

// Lambda is always surrounded by curly brackets
val anotherone = {something: Int -> something + 4}

// function types // lambda is the part in curlies
val addTwo: (Int) -> Int = { x -> x + 2}

fun feedFish(foodUnits: Int) = foodUnits + 10

fun updateDirty(initialDirt: Int, callback: (Int) -> Int): Int {
    return callback(initialDirt)
}

var dirtyTotal = 20
fun dirtyProcessor() {
    dirtyTotal = updateDirty(dirtyTotal, anotherone)
    println(dirtyTotal)
//    need :: for passing in regular func - note, not needed for lambda see above
    dirtyTotal = updateDirty(dirtyTotal, ::feedFish)
    println(dirtyTotal)

}