package day2.dailyProblemTwo
import scala.util.Random
import scala.io.Source

object hangman extends App {
  val random = new Random
  val filename = "/home/qa-admin/Documents/word.txt"
  for (line <- Source.fromFile(filename).getLines()) {
//    word = line.split()
    println(line)
  }


}

