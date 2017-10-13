package com.seefaribacode.onboarding


import scala.math._
// scala.math._ is like scala.math.*
import scala.util.Random

object NumberApp extends App {

  var count = 0
  println("val count = 0")
  count += 1
  println(s"count += 1, count == ${count}")
  count -= 1
  println(s"""count -= 1, count == ${count}\n""")

  println(s"""min(2, Pi) == ${min(2, Pi)}\n""")

  // Random integer from 0 up to given limit
  println(s"""new Random().nextInt(10) == ${new Random().nextInt(10)}\n""")
  println(s"""new Random().nextBoolean == ${new Random().nextBoolean()}""")
  println(s"""new Random(5).nextString == ${new Random().nextString(5)}\n""")

  // Without newing
  println(s"""BigInt.apply("123") == BigInt("123") == ${BigInt("123")}\n""")

  // Powers
  println(s"pow(2,3) == ${pow(2,3)} *Note that return type is Double")
  println(s"""BigInt(2).pow(1024) == ${BigInt(2).pow(324)}\n""")



}
