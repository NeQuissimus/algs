package alg.euler;

import java.util.stream.LongStream;

import alg.Prime;

/**
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public final class P10 {
  public static void main(String[] args) {
    System.out.println(
      LongStream.range(1L, 2_000_000L)
        .filter(Prime::isPrime).sum()
    );
  }
}
