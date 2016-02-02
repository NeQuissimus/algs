package alg;

import java.util.HashSet;
import java.util.Set;

final class Words {
  public static Set<String> findWords(final String s, final Set<String> dictionary) {
    if (null == s) {
      return null;
    }

    final Set<String> result = new HashSet<>();

    if ("".equals(s)) {
      return result;
    }

    for (int i = 1; i <= s.length(); i++) {
      final String left = s.substring(0, i);
      final String right = s.substring(i, s.length());

      if (dictionary.contains(left)) {
        final Set<String> rightResult = findWords(right, dictionary);

        if (null != rightResult) {
          if (right.length() == 0) {
            result.add(left);
          }

          for (String r : rightResult) {
            result.add((left + " " + r));
          }
        }
      }
    }

    return result;
  }
}
