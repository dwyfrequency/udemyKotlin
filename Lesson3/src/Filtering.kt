fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val curries = spices.filter { it -> it.contains("curry") }
    println("curries: $curries")
    val sortedCurries = curries.sortedWith(compareBy { it.length })
    println("sortedCurries: $sortedCurries")
    val OGstartsWithC = spices.filter { it -> it[0] == 'c'}
    println("OGstartsWithC: $OGstartsWithC")


}