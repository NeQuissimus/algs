package alg.euler;

import java.math.BigInteger;

/**
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/
public final class P16 {
  public static void main(String[] args) {
    System.out.println(
      BigInteger.valueOf(2).pow(1000).toString().chars().map(c -> c - '0').sum()
    );
  }
}
