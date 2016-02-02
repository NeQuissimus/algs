package alg;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public final class PermutationsTest {
  @Test
  public void testSimple() throws Exception {
    final String s = "ab";
    final Set<String> expected = new HashSet<>(Arrays.asList("ab", "ba"));

    assertEquals(expected, Permutations.perms(s));
  }
    @Test
    public void testThree() throws Exception {
      final String s = "abc";
      final Set<String> expected = new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));

      assertEquals(expected, Permutations.perms(s));
    }
}
