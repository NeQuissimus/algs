package alg.euler;

/**
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
public final class P4 {
  public static void main(String[] args) {
    int f1 = 0;
    int f2 = 0;

    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        final String s = String.valueOf(i * j);
        if (s.equals(new StringBuilder(s).reverse().toString()) && (i * j > f1 * f2)) {
          f1 = i;
          f2 = j;
        }
      }
    }

    System.out.println(f1 + " * " + f2 + " = " + f1 * f2);
  }
}
