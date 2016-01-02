//classes
class Person(val name:String, var age:Int){

  def this(name:String) = {
    this(name, 0) //primary ctor HAS TO BE CALLED
    println("secondary ctor called")
  }

  val weight:Int = 0
  def this(name:String, age:Int, weight:Int)={
    this(name, age)
    //this.weight = weight //why does this not work?
  }

  private val id:Int=12345
  protected val id2=54321

  private def helper() = {println("Helper called")}

  def doSth() = {this.helper()}

}
val peter = new Person("Peter", 23, 24)

//inheritance
abstract class Mammal(age:Int){
  def numberOfLegs:Int
  def this(age:Int, action:Unit) = {
    this(age)
    action
  }
}
class Human(name:String, age:Int) extends Mammal(age, println("superctor called")){
  def numberOfLegs = 2
}
val raffi = new Human("raffi", 23)

//private var with getter
class Car(private val wheels:Int){
  protected var _maxSpeed:Int = 0
  def this(wheels:Int, maxSpeed:Int){
    this(wheels)
    this._maxSpeed = maxSpeed
  }
  def maxSpeed:Int = {
    this._maxSpeed
  }
}
val ferrari = new Car(4, 308)
ferrari.maxSpeed

