
// FP Styled
sealed class Lst[T]()
case class Nil[T]() extends Lst[T]
case class Cons[T](head:T, tail:Lst[T]) extends Lst[T]

object Lst {
  def length[T](lst:Lst[T]):Int = {
    lst match {
      case Nil() => 0
      case Cons(_, tail) => 1+length(tail)
    }
  }
}

val list:Lst[Int] = Cons(1, Cons(2, Cons(3, Nil())))
Lst.length(list)


