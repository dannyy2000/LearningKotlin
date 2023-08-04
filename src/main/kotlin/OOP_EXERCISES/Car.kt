package OOP_EXERCISES

class Car (
   private var model:String,
    private var year:Int,
   private var price:Double
) {

    init {
        if (price >= 0.0){
            this.price = price
        }
    }



    fun setModel(value: String) {
        model = value
    }

    fun getModel(): String {
        return model
    }

    fun setYear(value: Int) {
        year = value
    }

    fun getYear(): Int {
        return year
    }


    fun setPrice(value: Double) {
        if (value >= 0.00) price = value
        else{
            price != value
        }
    }

    fun getPrice(): Double {
        return price
    }

    fun setDiscount1(): Double {
        return price - (price * 0.05)
    }

    fun setDiscount2(): Double {
        price *= 0.07
        return price
    }





}
