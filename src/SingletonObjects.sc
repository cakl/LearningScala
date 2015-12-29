//selfmade case class with companion (singleton) object
class Person(val name:String, val socialId:Int) {
  override def toString = s"Person with name: $name"
  private var religion:String = "Christian"
}

object Person {
  def apply(name:String, socialId:Int) = {
    new Person(name, socialId)
  }
}

val p = Person("Tobias", 12345)
println(p.toString)