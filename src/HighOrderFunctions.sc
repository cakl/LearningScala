def addWithoutSyntaxSugar(x: Int) = {
  new Function1[Int, Int]() {
    def apply(y: Int): Int = x + y
  }
}


var number = 42
val adder = addWithoutSyntaxSugar(number)
number = 43
adder(10) // 52



var anotherNumber = 69
val addSyntaxSugar : (Int) => Int = (x:Int) => x + anotherNumber


addSyntaxSugar(1) // 70
anotherNumber += 1
addSyntaxSugar(1) // 71

