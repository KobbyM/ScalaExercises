package day2.typeInference

object typeInference extends App {
    exampleMethod(20.2)

    def exampleMethod(number: Any): Unit = {
      println(number)
  }
}