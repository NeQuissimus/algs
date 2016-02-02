package alg.euler;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
Using [euler22_]names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/
public final class P22 {
  public static void main(String[] args) throws Exception {
    final List<String> names = new ArrayList<>();

    try (final InputStream is = P22.class.getResourceAsStream("/euler22_names.txt");
      final Scanner sc = new Scanner(is)) {
      sc.useDelimiter(Pattern.compile("\",?\"?"));

      while (sc.hasNext()) {
        names.add(sc.next());
      }
    }

    Collections.sort(names);

    long total = 0L;

    for (int i = 0; i < names.size(); i++) {
      total += names.get(i).chars().map(x -> x - 64).sum() * i;
    }

    System.out.println(total);
  }
}
