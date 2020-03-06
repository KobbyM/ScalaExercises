package day5.rockPaperScissors

import scala.util.Random

class AI{
  var random = Random.nextInt(2)
  var aiMove = ""

def getMove(): Unit ={
  if (random == 0){
    aiMove = "rock"
  } else if (random == 1){
    aiMove = "paper"
  } else
    aiMove = "scissors"
  println(aiMove)
}

}
