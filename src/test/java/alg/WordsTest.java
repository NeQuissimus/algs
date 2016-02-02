package alg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import static org.junit.Assert.*;

public final class WordsTest {
  @Test
  public void testPeanutButter() throws Exception {
    final Set<String> dict = new HashSet<>();
    dict.addAll(Arrays.asList("peanut", "pea", "nut", "butt", "butter"));

    final Set<String> expected = new HashSet<>();
    expected.addAll(Arrays.asList("pea nut butter", "peanut butter"));

    assertEquals(expected, Words.findWords("peanutbutter", dict));
  }
}
