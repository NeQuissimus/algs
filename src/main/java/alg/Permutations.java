package alg;

import java.util.HashSet;
import java.util.Set;

public final class Permutations {
  private Permutations() {}

  public static Set<String> perms(String s) {
    return perms(new HashSet<>(), s);
  }

  private static Set<String> perms(Set<String> acc, String s) {
    final int size = s.length();
    if (1 == size) {
      acc.add(s);
      return acc;
    } else {
      final char end = s.charAt(size - 1);
      final String rest = s.substring(0, size - 1);

      final Set<String> set = perms(acc, rest);
      final Set<String> result = new HashSet<>();

      for (String str : set) {
        for (int i = 0; i <= str.length(); i++) {
          result.add(new StringBuffer(str).insert(i, end).toString());
        }
      }

      return result;
    }
  }
}
