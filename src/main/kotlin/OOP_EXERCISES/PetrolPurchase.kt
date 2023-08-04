package OOP_EXERCISES

class PetrolPurchase(
    private var location:String,
    private var type:String,
    private var quantity:Int,
    private var price:Double,
    private var discount:Double
){

    fun setLocation(value:String){
        location = value
    }
    fun getLocation():String{
        return location
    }

    fun setType(value: String){
        type = value
    }

    fun getType():String{
        return type
    }

    fun setQuantity(value: Int){
        quantity = value
    }

    fun getQuantity():Int{
        return quantity
    }

    fun setPrice(value: Double){
        price = value
    }

    fun getPrice():Double{
        return price
    }

    fun setDiscount(value: Double){
        discount = value
    }

    fun getDiscount():Double{
        return discount
    }

    fun getPurchaseAmount():Double{
       var netAmount = getQuantity() * getPrice() - getDiscount()
        return netAmount
    }


}