package alg;

public final class BubbleSort {

  private BubbleSort() {}

  public static <T extends Comparable<T>> T[] sort (T[] elements) {
    for (int i = elements.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        final T one = elements[j];
        final T two = elements[j + 1];

        if (one.compareTo(two) > 0) {
          elements[j + 1] = one;
          elements[j] = two;
        }
      }
    }

    return elements;
  }
}
