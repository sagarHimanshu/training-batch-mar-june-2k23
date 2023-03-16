object Scala_List
{
  private def split_list[A](numb: List[A], n: Int): (List[A], List[A]) =
  {
    (numb.take(n), numb.drop(n))
  }
  def main(args: Array[String]): Unit =
  {
    val num = List(1,2,3,4,5,6,7,8,9,10,11)
    println("Original List:")
    println(num)
    println("Split the said list into 2 lists:")
    val a = scala.io.StdIn.readInt()
    println(split_list(num, a))
  }
}
