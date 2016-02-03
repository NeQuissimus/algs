package alg.euler;

/**
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/
public final class P14 {
  public static void main(String[] args) {
    long maxCount = 0L;
    int max = 0;

    for (int x = 1; x < 1_000_000; x++) {
      long count = 0L;

      long n = x;
      while (n > 1) {
        count++;
        n = collatz(n);
      }

      if (count > maxCount) {
        max = x;
        maxCount = count;
      }
    }

    System.out.println(max);
  }

  private static long collatz(long n) {
    if (n % 2 == 0) {
      return (long) n / 2;
    } else {
      return 3 * n + 1;
    }
  }
}
