package day3.garage

class Bike (var bikeModel: String, var bikeFuel: Double) extends Vehicle{
  def modelName: String =  bikeModel
  def fuel: Double = bikeFuel

  override def wheels: Int = 2
  override def toString: String = s"Model Name: $modelName \n -------------------------------- \n No. of Wheels: $wheels \n Fuel Capacity: $fuel L \n"

}
