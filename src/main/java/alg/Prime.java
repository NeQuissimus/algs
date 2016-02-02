package alg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.LongStream;

public final class Prime {

  static final int MAX_SIEVE = 250_000;
  static final boolean[] SIEVE = new boolean[MAX_SIEVE];

  private final static Map<Long, Boolean> TESTED = new HashMap<>();

  static {
    Arrays.fill(SIEVE, true);
    SIEVE[0] = false;
    SIEVE[1] = false;

    for (int i = 2; i < MAX_SIEVE; i++) {
      if (SIEVE[i]) {
        for (int j = 2; j * i < MAX_SIEVE; j++) {
          SIEVE[j * i] = false;
        }
      }
    }

    for (int i = 0; i < SIEVE.length; i++) {
      TESTED.put((long)i, SIEVE[i]);
    }
  }

  private Prime() {}

  public static boolean isPrime(long n) {
    if (n < MAX_SIEVE) {
      return SIEVE[(int)n];
    } else {
      return TESTED.computeIfAbsent(n, i -> LongStream.rangeClosed(2, (long)(Math.sqrt(i))).parallel().filter(j -> TESTED.getOrDefault(j, true)).allMatch(j -> i % j != 0));
    }
  }

  public static boolean isPrime(int n) {
    return isPrime((long) n);
  }
}
