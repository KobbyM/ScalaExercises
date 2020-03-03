package day2.String

import sun.security.util.Length

object Strings extends App {
  stringMethod("Hello", 3)

  def stringMethod(input: String, length: Int): Unit ={
    println(input.takeRight(length))
  }
}
