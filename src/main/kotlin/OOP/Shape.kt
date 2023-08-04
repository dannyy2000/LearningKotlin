package OOP

class Shape constructor(
    var height:Int = 0,
    var width:Int =0,
    var volume:Int = 0

){
//    init {
//        height = 10
//        width = 20
//        volume = 30
//    }

}

fun main() {
    val shape = Shape()

    println(shape.height)
}