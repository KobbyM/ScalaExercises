package day3.garage

abstract class Vehicle {
  def modelName: String
  def wheels: Int
  def fuel: Double
  def price: Double = (wheels * 50) + (fuel * 100)
  override def toString: String = s"Model Name: $modelName \n -------------------------------- \n No. of Wheels: $wheels \n Fuel Capacity: $fuel L \n Total Price: $price \n"

}


