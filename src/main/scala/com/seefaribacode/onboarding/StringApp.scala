package com.seefaribacode.onboarding

import scala.util.Random

object StringApp extends App {

  // String interpolation with double quotes
  println(s"""To escape chars, surround the s\" ... $${interpolateMe} ... \" becomes s\"\"\" ... $${interpolateMe} ... \"\"\" \n""")


  // Return common characters, in order of string1

  println(s"INTERSECT 'Hello'.intersect('World') == ${"Hello".intersect("World")}")
  println(s"""INTERSECT \"Hello\".intersect(\"World\") == ol //${"Hello".intersect("World") == "ol"}\n""")

  // Convert String to number

  println(s"""\"99.4\".toDouble == ${99.4.toDouble}""")
  println(s"""\"99.4\".toInt == ${99.4.toInt}\n""")

  // Get distinct characters
  println(s"""\"Hello\".distinct == ${"Hello".distinct}\n""")

  // Get nth character of a string
  println(s"""\"Hello\"(3) == \"Hello\".apply(3) == ${"Hello".apply(3)}\n""")


  // Random String of length n
  println(s"""new Random().nextBoolean == ${new Random().nextBoolean()}""")
  println(s"""new Random(5).nextString == ${new Random().nextString(5)}\n""")



}
