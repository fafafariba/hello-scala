package com.seefaribacode.onboarding

object StringApp extends App {

  // String interpolation with double quotes
  println(s"""To escape chars, surround the s\" ... $${interpolateMe} ... \" becomes s\"\"\" ... $${interpolateMe} ... \"\"\" \n""")


  // Return common characters, in order of string1

  println(s"INTERSECT 'Hello'.intersect('World') == ${"Hello".intersect("World")}")
  println(s"""INTERSECT \"Hello\".intersect(\"World\") == ol //${"Hello".intersect("World") == "ol"}\n""")

  // Convert String to number

  println(s"""\"99.4\".toDouble == ${99.4.toDouble}""")
  println(s"""\"99.4\".toInt == ${99.4.toInt}""")

}
