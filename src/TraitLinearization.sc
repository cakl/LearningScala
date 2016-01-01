class Animal() {
  def msg()=println("Animal")
}
trait Furry extends Animal {
  override def msg()={
    super.msg()
    println("Furry")
  }
}
trait HasLegs extends Animal {
  override def msg()={
    super.msg()
    println("HasLegs")
  }
}
trait FourLegged extends HasLegs {
  override def msg()={
    super.msg()
    println("FourLegged")
  }
}

class SpecialAnimal

class Cat() extends SpecialAnimal with Furry with FourLegged {
  override def msg()={
    super.msg()
    println("Cat")
  }
}
val cat:Cat = new Cat()
cat.msg() //Animal Furry HasLegs FourLegged Cat