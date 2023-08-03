package OOP

class Boy {
    var name = "Daniel";
    var age = 1


    fun pray(){
        println("The boy is praying")
    }

    fun walk(){
        println("The boy is walking")
    }

}

fun main() {
    var boy1 = Boy()
    var boy2 = Boy()
    var boy3 = Boy()

    println(boy1.name)
    println(boy1.age)

    boy1.pray()
}