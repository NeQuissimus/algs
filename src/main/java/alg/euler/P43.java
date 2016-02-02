package alg.euler;

import java.util.Set;
import java.util.stream.LongStream;

import alg.Permutations;

/**
The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.

Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:

    d2d3d4=406 is divisible by 2
    d3d4d5=063 is divisible by 3
    d4d5d6=635 is divisible by 5
    d5d6d7=357 is divisible by 7
    d6d7d8=572 is divisible by 11
    d7d8d9=728 is divisible by 13
    d8d9d10=289 is divisible by 17

Find the sum of all 0 to 9 pandigital numbers with this property.
*/
public final class P43 {
  public static void main(String[] args) {
    final Set<String> numbers = Permutations.perms("0123456789");

    System.out.println(
      numbers.stream().parallel()
        .map(s -> s.chars().map(c -> c - '0').toArray())
        .filter(a -> check(a, 2, 2) && check(a, 3, 3) && check(a, 4, 5)
              && check(a, 5, 7) && check(a, 6, 11) && check(a, 7, 13)
              && check(a, 8, 17))
        .mapToLong(a -> {
          long r = 0L;
          for (int i = 0; i < 10; i++) {
            r += a[9 - i] * (long)Math.pow(10, i);
          }
          return r;
        }).sum()
    );
  }

  private static boolean check(int[] vals, int start, int divideBy) {
    return (vals[start - 1] * 100 + vals[start] * 10 + vals[start + 1]) % divideBy == 0;
  }
}
