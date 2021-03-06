package week6

import scala.io.Source

object x {
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")
  
  val words = in.getLines
  
  val mnem = Map('2' -> "ABC", '3'-> "DEF", '4' -> "GHI", '5'->"JKL",
  							 '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")
  							 
  	val charCode: Map[Char, Char] =
  		for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit
def wordCode(word: String): String =
   		word.toUppeCase map charCode
}