// File: src/test/scala/FunctionsTest.scala
package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FunctionsTest extends AnyFlatSpec with Matchers {
  "add" should "correctly sum two positive numbers" in {
    Functions.add(2, 3) shouldEqual 5
  }
  it should "handle negatives" in {
    Functions.add(-1, 1) shouldEqual 0
  }

  "factorial" should "compute 0! = 1" in {
    Functions.factorial(0) shouldEqual 1
  }
  it should "compute 5! = 120" in {
    Functions.factorial(5) shouldEqual 120
  }
  it should "throw for negative input" in {
    an [IllegalArgumentException] should be thrownBy Functions.factorial(-1)
  }

  "isPrime" should "identify primes correctly" in {
    Functions.isPrime(2) shouldBe true
    Functions.isPrime(17) shouldBe true
  }
  it should "identify non-primes" in {
    Functions.isPrime(1) shouldBe false
    Functions.isPrime(15) shouldBe false
  }
}
