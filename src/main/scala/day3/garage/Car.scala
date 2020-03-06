package day3.garage

class Car(carModel: String, carWheels: Int, carFuel: Double)extends Vehicle{
  def modelName: String = carModel
  def wheels: Int = carWheels
  def fuel: Double = carFuel

  override def toString: String = s"Model Name: $modelName \n -------------------------------- \n No. of Wheels: $wheels \n Fuel Capacity: $fuel L \n Total Price: £$price \n"
}
