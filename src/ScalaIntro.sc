import java.time.{DayOfWeek, LocalDate}

//Hello World
val message = "Hello World"
println(message)
//Date Example
val today = LocalDate.now
val dow = today.getDayOfWeek
val isWeekend = {
  if(dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY){
    "YES"
  } else {
    "NO"
  }
}

//Composable Scala
def factorial(start: Int): Int = {
  def fact(i: Int, accumulator: Int): Int = {
    if(i == 1){
      accumulator
    } else {
      fact(i-1, i*accumulator)
    }
  }
  fact(start, 1)
}
factorial(5)

