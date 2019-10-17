package aquarius

class Fish(val friendly: Boolean, volumeNeeded: Int) {

    val size: Int
//    constructor() :

    init {
        if (friendly) size = volumeNeeded
        else size = volumeNeeded * 2
    }
}
