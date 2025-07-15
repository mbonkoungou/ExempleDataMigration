// File: src/main/scala/Functions.scala
package example

object Functions {
  /** Returns the sum of two integers */
  def add(a: Int, b: Int): Int = a + b

  /** Returns the factorial of n (n!); throws IllegalArgumentException if n < 0 */
  def factorial(n: Int): Int =
    if (n < 0) throw new IllegalArgumentException("Negative factorial")
    else if (n == 0) 1
    else (1 to n).product

  /** Returns true if n is prime (n ≥ 2), false otherwise */
  def isPrime(n: Int): Boolean =
    if (n < 2) false
    else !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
}
