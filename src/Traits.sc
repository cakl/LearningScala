//Traits

trait Equal[T] {
  def isEqual(t:T):Boolean
  def isNotEqual(t:T) = !isEqual(t)
}

trait Named {
  def named:String
}

//this mixin with uap is really smooth shit!
case class User(named:String) extends Equal[User] with Named {
  def isEqual(t:User):Boolean = this.named == t.named
}