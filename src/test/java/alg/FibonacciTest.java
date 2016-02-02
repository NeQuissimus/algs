package alg;

import org.junit.Test;
import static org.junit.Assert.*;

public final class FibonacciTest {
  @Test
  public void testSimple() throws Exception {
    assertEquals(1L, Fibonacci.fib(1L));
    assertEquals(1L, Fibonacci.fib(2L));
  }

  @Test
  public void test10() throws Exception {
    assertEquals(55L, Fibonacci.fib(10L));
  }

  @Test
  public void test20() throws Exception {
    assertEquals(6765L, Fibonacci.fib(20L));
  }

  @Test
  public void test80() throws Exception {
    assertEquals(23416728348467685L, Fibonacci.fib(80L));
  }
}
