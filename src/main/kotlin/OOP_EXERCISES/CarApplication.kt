package OOP_EXERCISES

fun main() {
    val car1 = Car(model = "Benz", year = 2023, price = -1.0)
    val car2 = Car(model = "Toyota", year = 2020, price = -100.00)

    car1.setPrice(2.00)
    car2.setPrice(50.0)
    println(car1.getPrice())
    println(car2.getPrice())
    var discount1 = car1.getPrice() - (car1.getPrice() * 0.09)
    car1.setPrice(discount1)

    var discount2 = car2.getPrice() - (car2.getPrice() * 0.07)
    car2.setPrice(discount2)

    println(car1.getPrice())
    println(car2.getPrice())



}