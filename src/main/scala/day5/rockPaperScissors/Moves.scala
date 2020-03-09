package day5.rockPaperScissors

import scala.io.StdIn
import scala.util.Random

object Moves {
  val input = scala.io.StdIn.readLine()
  var random = Random.nextInt(2)
  var aiMove = ""

  def userMove(): Unit = {
  println ("Input your choice: \n ROCK - PAPER - SCISSORS - LIZARD - SPOCK ")
    return input
  println ("You have chosen " + input)
}

  def aiInput(): Unit ={
    if (random == 0){
      aiMove = "rock"
      return aiMove
    } else if (random == 1){
      aiMove = "paper"
      return aiMove
    } else
      aiMove = "scissors"
    return aiMove
  }
}
