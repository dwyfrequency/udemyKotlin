fun main(args: Array<String>) {
    println("We ballin boy")
}

// Lambda is always surrounded by curly brackets
val anotherone = {something: Int -> something + 4}

// function types // lambda is the part in curlies
val addTwo: (Int) -> Int = { x -> x + 2}

fun feedFish(foodUnits: Int) = foodUnits + 10

fun updateDirty(initialDirt: Int, callback: (Int) -> Int): Int {
    return callback(initialDirt)
}