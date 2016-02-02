package alg;

import org.junit.Test;
import static org.junit.Assert.*;

public final class MergeSortTest {
  @Test
  public void testSimple() throws Exception {
    final Integer[] vals = new Integer[] {2, 3, 4, 1};

    assertArrayEquals(new Integer[] {1, 2, 3, 4}, MergeSort.sort(vals, new Integer[vals.length]));
  }

  @Test
  public void testSorted() throws Exception {
    final Long[] vals = new Long[] {1L, 2L, 10L, 20L, 99999L};

    assertArrayEquals(new Long[] {1L, 2L, 10L, 20L, 99999L}, MergeSort.sort(vals, new Long[vals.length]));
  }

  @Test
  public void testInverse() throws Exception {
    final Long[] vals = new Long[] {10L, 9L, 8L, 7L, 6L, 5L};

    assertArrayEquals(new Long[] {5L, 6L, 7L, 8L, 9L, 10L}, MergeSort.sort(vals, new Long[vals.length]));
  }
}
