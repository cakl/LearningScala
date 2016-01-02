trait Fruit
class Banana extends Fruit
class Apple extends Fruit

class CoVariantBasket[+T](init:T) {
  private val current : T = init
  def get : T = current
  //def set(t:T) = current = t
}

class ContraVariantBasket[-T](init:T) {
  private var current : T = init
  //def get : T = current
  def set(t:T) = current = t
}

val bananaBasket : CoVariantBasket[Banana] = new CoVariantBasket[Banana](new Banana)
val fruitBasket : CoVariantBasket[Fruit] = bananaBasket

val fruitBasket2 : ContraVariantBasket[Fruit] = new ContraVariantBasket[Fruit](new Apple)
val bananaBasket2 : ContraVariantBasket[Banana] = fruitBasket2
//fruitBasket2.init = new Apple
//bananaBasket2.init = new Apple
//val aFruit : Banana = bananaBasket2.init
//println(aFruit)