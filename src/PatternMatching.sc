//pattern matching with classes
case class Person(name:String, alter:Int)

def matchAPerson(person: Person) = {
  person match {
    case Person("Peter", 42)           => "Found Peter!"
    case Person(name, age) if age < 18 => s"minor $name"
    case p if p.alter == 42   => "Person with a magical age!"
    case Person(name, _)               => s"adult $name"
    //case _                             => "uknown person"
  }
}

val ruedi = Person("Ruedi", 42)
matchAPerson(ruedi)

//pattern matching with types
abstract class Point {
  def x : Int
  def y : Int
}

case class Point3D(x:Int, y:Int, z:Int) extends Point
val p : Point = Point3D(1,2,3)

def matchAPoint(p : Point) = {
  p match {
    case p : Point3D => "3D Point"
    case p : Point => "Point"
  }
}
matchAPoint(p) //3D Point