package alg;

import org.junit.Test;
import static org.junit.Assert.*;

public final class PrimeTest {
  @Test
  public void testSimple() throws Exception {
    assertFalse(Prime.isPrime(1L));
    assertTrue(Prime.isPrime(2L));
    assertTrue(Prime.isPrime(3L));
    assertFalse(Prime.isPrime(4L));
    assertTrue(Prime.isPrime(5L));
    assertFalse(Prime.isPrime(6L));
  }
}
