package com.seefaribacode.onboarding

object HelloApp extends App  {

    class Hello(var greeting: String = "Hello") {
        var name: String = ""

        def sayHello(_name: String): String = {
            this.name = _name
            getMessage()
        }

        def getMessage(): String = {
            s"$greeting $name"
        }
    }

}
