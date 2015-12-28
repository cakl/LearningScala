//value types
val x = 42
val y = 42.42
val is = true
val z : Float = (1.0/3.0).toFloat

//ref types
val surname = "Bock"
val name = "Sebastian" + s" ${surname}" //string interpolation
val list1 = List(1,2,3)
val list2 = "a" :: "b" :: "c" :: Nil
val nix = null
//Nothing Type
def throwException(): Nothing = {
  throw new NullPointerException
}

//list Type
val list = 1 :: 2 :: 3 :: Nil
list.head
list.tail
list(0)
//tupel type
val tupel2 = Tuple2(1, "String")
val theInt : Int = tupel2._1
val theString :String = tupel2._2
val triple = ("key", "value", 3)
val pair = "key" -> "value" //other notation
//variables
val i = 0
var j = 1
// i += 1 //reassignment does not work
j += 1