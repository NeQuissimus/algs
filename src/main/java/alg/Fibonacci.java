package alg;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public final class Fibonacci {
  private Fibonacci() {}

  private static final Map<Long, Long> cache = new HashMap<>();
  private static final Map<Long, BigInteger> bigCache = new HashMap<>();

  public static long fib(long idx) {
    if (idx <= 0L) {
      return 0L;
    } else if (idx < 2L) {
      return 1L;
    } else {
      return cache.computeIfAbsent(idx, i -> fib(idx - 1L) + fib(idx - 2L));
    }
  }

  public static BigInteger bigFib(long idx) {
    if (idx <= 0L) {
      return BigInteger.ZERO;
    } else if (idx < 2L) {
      return BigInteger.ONE;
    } else {
      return bigCache.computeIfAbsent(idx, i -> bigFib(idx - 1L).add(bigFib(idx - 2L)));
    }
  }
}
