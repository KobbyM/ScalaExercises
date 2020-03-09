package day5.rockPaperScissors

object Game {
  val gameEnd = false
  val restart = "no"

  while (gameEnd == false){
    Moves.userMove()
    if (Moves.input == "rock" && Moves.aiMove =="rock"){
      println("DRAW")
    } else if (Moves.input == "rock" && Moves.aiMove =="paper")
      println("LOSE")
    }
  println("END game?")
  if (Moves.userMove() == "yes"){
    restart == "yes"
  }else
  gameEnd == true
}
