package OOP_EXERCISES

class Car (
   private var model:String,
    private var year:Int,
   price:Double
) {
    private var price: Double = if (price > 0) price else 0.0


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





}
