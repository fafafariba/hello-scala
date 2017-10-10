package com.seefaribacode.onboarding

object App {

  class Hello(var greeting: String = "Hello") {
    private var nameC: String = ""

    def sayHello(name: String): Unit = {
      this.nameC = name
      val x = getMessage()
      println(x)
    }

    def getMessage(): String = {
      println(s"inside def, nameC: $nameC")
      s"$greeting $nameC"
    }
  }
}


// Alternative
object App2 {

  class Hello(var greeting: String = "Hello") {
    private var name: String = null
    private lazy val message: String = s"$greeting $name" //TODO evaluated once declared

    def sayHello(name: String): Unit = {
      this.name = name
      val x = this.name
      println(s"name $name")
      println(s"this.name $x")
      println(message)
    }

    def getMessage = message

  }
}
