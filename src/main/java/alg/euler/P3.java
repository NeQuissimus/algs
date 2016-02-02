package alg.euler;

import java.math.BigInteger;
import java.util.stream.LongStream;

import alg.Prime;

/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
public final class P3 {
  public static void main(String[] args) {
    final long n = 600_851_475_143L;
    // final long n = 13_195L;

    // final long result = LongStream.rangeClosed(1, n / 2).parallel().filter(Prime::isPrime).filter(i -> n % i == 0).max().getAsLong();

    for (long i = (long) n / 2; i > 0; i--) {
      if ((n % i == 0) && BigInteger.valueOf(i).isProbablePrime(1) && Prime.isPrime(i)) {
        System.out.println(i);
        System.exit(0);
      }
    }
  }
}
