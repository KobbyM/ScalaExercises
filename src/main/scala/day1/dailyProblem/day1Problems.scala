package day1.dailyProblem

object day1Problems extends App {

  bottlesOfBeer(1000000)
  def bottlesOfBeer(number: Int): Unit = {

    for (num <- number until 0 by -1 ){
      if (number == 1){
        println("1 bottle of beer on the wall")
      }
      else
        println(s"$number bottles of beer on the wall")
    }

    println("0 bottles of beer on the wall")
    println("Buy more beers")
  }
}

