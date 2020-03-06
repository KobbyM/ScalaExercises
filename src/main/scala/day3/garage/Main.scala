package day3.garage

object Main {
  def main(args: Array[String]): Unit = {
    val kobbyM = new Customer("Kobby", 21)
    val nathanR = new Employee("Nathan", 20)
    val ferrari = new Car(carModel = "Ferrari F20", 4, 2.0)
    val yamaha = new Bike(bikeModel = "YAMAHA 21672", bikeFuel = 1.4)
    println(kobbyM)
    println(nathanR)
    println(" ")
    println(ferrari)
    println(yamaha)
  }
}
