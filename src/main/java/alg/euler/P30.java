package alg.euler;

import java.util.HashSet;
import java.util.Set;

import java.util.stream.IntStream;

/**
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

    1634 = 1^4 + 6^4 + 3^4 + 4^4
    8208 = 8^4 + 2^4 + 0^4 + 8^4
    9474 = 9^4 + 4^4 + 7^4 + 4^4

As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/
public final class P30 {
  public static void main(String[] args) {
    final Set<Integer> ints = new HashSet<>();

    System.out.println(IntStream.range(2, 9999999).filter(i -> {
      int j = i;
      int res = 0;
      for (int n = 0; n < 6; n++) {
        res += (int)Math.pow(j / ((int)Math.pow(10, 5 - n)), 5);
        j %= (int)Math.pow(10, 5 - n);
      }

      return (i == res);
    }).sum());
  }
}
