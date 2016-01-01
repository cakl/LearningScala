//anonymous functions
(m:Int, n:Int) => m+n
(m:Int, n:Int) => {m+n}

//curry
val divide = (m:Int) => (n:Int) => m/n //curry style
val divide100 = divide(100)
divide100(3)
//Filtering
case class Person(name:String, age:Int)
val people = Person("Josef", 21) :: Person("Maria", 17) :: Nil
val isAdult = (p:Person) => p.age >= 18 //predicate
//def filter(p: (A) ⇒ Boolean): List[A]
var adults = people.filter(isAdult)
adults = people.filter((p:Person) => p.age >= 18)
adults = people.filter(p => p.age >= 18)
adults = people.filter{p =>
  p.age >= 18 && p.age < 99
} //block allows multiple statements


//functions as objects
val isAnAdult: Function1[Person, Boolean] = {
  (p:Person) => p.age >= 18
}
isAnAdult(Person("Raffi", 23))

val isAnAdult2 = new Function1[Person,Boolean]  {
  def apply(p:Person): Boolean = p.age >= 18      //implements apply, has to be in method, a single expression is not possible here!
}
val add = new Function2[Int, Int, Int] {
  def apply(x:Int, y:Int) : Int = x+y
}
//recap: different styles to create a function
val func1: (Int) => Int = (x:Int) => x^2
val func2 : Function1[Int, Int] = (x:Int) => x^2
val func3 = new Function[Int, Int] { def apply(x:Int):Int = x^2  }
// calling by name/value
def returner(x:Int) = {
  println("calling retuner")
  x
}
def callByValue(x: Int) = {
  println("x1=" + x)
  println("x2=" + x)
}
def callByName(x: => Int) = { //function that has Param of Type Int and returns Int
  println("x1=" + x)
  println("x2=" + x)
}
//ext signature
def callByNameExt(value:Int, func:Int => Int) ={
  println("x1=" + func(value))
  println("x2=" + func(value))
}

callByValue(returner(5))
callByName(returner(5))
callByNameExt(5, returner)
