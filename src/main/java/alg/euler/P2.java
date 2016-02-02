package alg.euler;

import java.util.stream.LongStream;

import alg.Fibonacci;

/**
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/
public final class P2 {
  public static void main(String[] args) {
    System.out.println(LongStream.range(0, 100).map(i -> Fibonacci.fib(i + 1L)).filter(i -> i > 0 && i <= 4_000_000L).filter(i -> i % 2L == 0).sum());
  }
}