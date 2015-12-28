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
  p.age >= 18
  p.age < 99
} //block allows multiple statements

