// COSC 455 - Programming Languages: Implementation and Design
// Project 2

// NAME: MatarAlnuaimi

val chinese: List[String] = List("ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu", "shi")
val english: List[String] = List("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten")
val a = chinese
val b = english

val mylist = a ::: b


val list = List(1,2,3,4,5,6)


def go(mylist: List[String])={
  val numList:List[Int] = convertMyList(mylist)
  val cleanList:List[Int] = numList filter(_ > -5)

  println("translated list "+ translate(cleanList))
  println("total sum " + sumAll(cleanList))
  println()
  println("total product " + mulAll(cleanList))
}

def convertMyList(aList:List[String]): List[Int] ={
  aList.map(element => convert(element))
}


def convert(str : String): Int = str match{
  case "ling" => 0
  case "yi" => 1
  case "er" => 2
  case "san" => 3
  case "si" => 4
  case "wu" => 5
  case "liu" => 6
  case "qi" => 7
  case "ba" => 8
  case "jiu" => 9
  case "shi" => 10
  case "zero" => 0
  case "one" => 1
  case "two" => 2
  case "three" => 3
  case "four" => 4
  case "five" => 5
  case "six" => 6
  case "seven" => 7
  case "eight" => 8
  case "nine" => 9
  case "ten" => 10
  case _ => -5

}


def sumAll(aList: List[Int]): Int = aList match{
  case List() => 0
  case head::tail => head + sumAll(tail)
}

//sumAll(list)

def mulAll(aList: List[Int]) : Int = aList match{
  case List() => 1
  case head::tail => head*mulAll(tail)
}

//mulAll(list)

def translate(aList:List[Int]): String =  aList match{
  case List() => " "
  case head::tail => aList.head + " " + translate(aList.tail)
}

//translate(list)
go(List("yi","josh", "three", "si"))