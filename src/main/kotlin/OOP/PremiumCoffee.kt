package OOP

class PremiumCoffee(price:Double, color:String):
    BaseCoffee(price,color){


        override fun makeCoffee(){
            println("You are making coffee")
        }


      fun buyCoffee(){
          println("Buy me coffee")
      }

}