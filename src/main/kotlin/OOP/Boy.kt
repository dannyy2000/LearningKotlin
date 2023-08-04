package OOP

class Boy {
    var name = "Daniel";
    var age = 1

    var nam : String = "name"
        set(value) {
            if (value.length < 3) {
                println("The value is less than 3")
            }
            field = value
        }

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

    boy1.nam = "My"
    println(boy1.nam)

    println(boy1.name)
    println(boy1.age)

    boy1.pray()
}