
import com.seefaribacode.onboarding.HelloApp.Hello
import org.scalatest.FunSpec

class HelloTest extends FunSpec{

  describe("Hello Class"){
    println("Running Hello Class Tests")

    describe("When saying Hello in French") {
      val frenchHello = new Hello("Bonjour")
      val actualMessage = frenchHello.sayHello("Pierre")
      val actualName = frenchHello.name

      it("should change frenchHello.name") {
        assert(actualName == "Pierre")
      }

      it("should print 'Hello <name>!'") {
        assert(actualMessage == "Bonjour Pierre")
      }
    }

    describe("When no greeting provided") {
      val defaultHello = new Hello()
      val actualMessage = defaultHello.sayHello("Mr. Robot")
      val actualName = defaultHello.name

      it("should default to 'Hello '") {
        assert(actualMessage == "Hello Mr. Robot")
      }
      it("should change defaultHello.name") {
        assert(actualName == "Mr. Robot")
      }
    }

  }

}
