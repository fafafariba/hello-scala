package com.seefaribacode.onboarding

import com.seefaribacode.onboarding.App.Hello
import org.scalatest.FunSpec

class AppTest extends FunSpec{

  describe("App"){

    describe("When saying Hello in French") {
      val frenchHello = new Hello("Bonjour")
      frenchHello.sayHello("Pierre")

      it("should print 'Hello <name>!'") {
        assert(frenchHello.getMessage() == "Bonjour Pierre")
      }
    }

    describe("When no greeting provided") {
      val defaultHello = new Hello()
      defaultHello.sayHello("Mr. Robot")

      it("should default to 'Hello '") {
        assert(defaultHello.getMessage() == "Hello Mr. Robot")
      }
    }
  }

}
