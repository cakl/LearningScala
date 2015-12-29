//Binary Tree with ADT

sealed class Tree[T]()
case class Leaf[T](value:T) extends Tree[T]
case class Branch[T](value:T, left:Tree[T], right:Tree[T]) extends Tree[T]

val aTree:Tree[Int] = Branch(1, Branch(2, Leaf(3), Leaf(4)), Branch(5, Leaf(6), Leaf(7)))

object Tree {
  def traversInorder[T](t:Tree[T]):Unit = {
    t match {
      case Leaf(v:T) => println(v)
      case Branch(v:T, left:Tree[T], right:Tree[T]) => {
        traversInorder(left)
        println(v)
        traversInorder(right)
      }
    }
  }
}

Tree.traversInorder(aTree)