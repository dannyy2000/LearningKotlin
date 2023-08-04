package OOP_EXERCISES

fun main() {
    var petrolPurchase = PetrolPurchase(location = "Yaba", type = "Petrol", quantity = 20, price = 500.00,
        discount = 3.00)
    println(petrolPurchase.getPurchaseAmount())
}