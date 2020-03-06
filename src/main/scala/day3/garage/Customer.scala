package day3.garage

class Customer (name: String, age: Int) extends Person(name, age) {
  override def toString: String = s"First Name: $name, Age: $age years old"
}
