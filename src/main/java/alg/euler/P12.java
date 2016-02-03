package alg.euler;

import java.util.concurrent.atomic.LongAdder;
import java.util.stream.LongStream;

public final class P12 {
  public static void main(String[] args) {
    final LongAdder adder = new LongAdder();

    int count = 0;
    int divisors = 0;

    while (divisors < 500) {
      adder.add(count++);
      final long current = adder.longValue();

      divisors = findDivisors(current);
    }

    System.out.println(adder.longValue());
  }

  private static int findDivisors(long n) {
    int count = 0;

    for (long i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }

    return count;
  }
}
