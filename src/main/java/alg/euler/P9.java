package alg.euler;

/**
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public final class P9 {
  public static void main(String[] args) {
    for (int a = 0; a < 1000; a++) {
      for (int b = 0; b < 1000; b++) {
        for (int c = 0; c < 1000; c++) {
          if ((a < b) && (b < c) && (a + b + c == 1000) && (a * a + b * b == c * c)) {
            System.out.println(a * b * c);
            System.exit(0);
          }
        }
      }
    }
  }
}
