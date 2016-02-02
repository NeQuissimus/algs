package alg.euler;

import java.util.stream.LongStream;

import alg.Prime;

/**
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/
public final class P7 {
  public static void main(String[] args) {
    System.out.println(
      LongStream.range(0, Long.MAX_VALUE)
        .filter(Prime::isPrime)
        .skip(10_000)
        .findFirst()
        .getAsLong()
    );
  }
}
