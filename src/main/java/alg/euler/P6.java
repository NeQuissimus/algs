package alg.euler;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public final class P6 {
  public static void main(String[] args) {
    final BigInteger sumSq = IntStream.rangeClosed(1, 100).mapToObj(BigInteger::valueOf).map(i -> i.pow(2)).reduce(BigInteger.ZERO, (acc, v) -> acc.add(v));
    final BigInteger sqSum = IntStream.rangeClosed(1, 100).mapToObj(BigInteger::valueOf).reduce(BigInteger.ZERO, (acc, v) -> acc.add(v)).pow(2);

    System.out.println(sqSum.subtract(sumSq));
  }
}
