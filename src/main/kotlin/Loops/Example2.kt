package Loops

fun main() {
    val items = listOf("Food","Kotlin","Java","Water")
    for (item in items.indices){
        println("item in $item is ${items[item]}")
    }
}