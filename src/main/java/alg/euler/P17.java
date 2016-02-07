package alg.euler;

import java.util.stream.IntStream;

/**
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
*/
public final class P17 {
  private static final String[] exp = new String[] { "", "", " hundred and ", " thousand " };
  private static final String[] tens = new String[] {
    "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
  };
  private static final String[] numbers = new String[] {
    "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
    "eighteen", "nineteen"
  };

  public static void main(String[] args) {
IntStream.rangeClosed(1, 1000).mapToObj(P17::convert).map(s -> s.replaceAll(" ", "")).forEach(System.out::println);

    System.out.println(
      IntStream.rangeClosed(1, 1000).mapToObj(P17::convert).map(s -> s.replaceAll(" ", "")).mapToInt(String::length).sum()
    );
  }

  private static String convert(int n) {
    if (n < numbers.length) {
      return numbers[n];
    } else if (n < 100) {
      final int x2 = n / 10;
      final int x1 = n % 10;

      return tens[x2 - 2] + convert(x1);
    } else if (n < 1000) {
      final int x3 = n / 100;
      final int x2_1 = n % 100;
      if (x2_1 == 0) {
        return numbers[x3] + exp[2].substring(0, 8);
      } else {
        return numbers[x3] + exp[2] + convert(x2_1);
      }
    } else if (n == 1000) {
      return numbers[1] + exp[3];
    } else {
      return "";
    }
  }
}
