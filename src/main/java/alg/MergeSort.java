package alg;

public final class MergeSort {
  private MergeSort() {}

  public static <T extends Comparable<T>> T[] sort(T[] elements, T[] tmp) {
    sort(elements, 0, elements.length, tmp);
    return tmp;
  }

  private static <T extends Comparable<T>> void sort(T[] elements, int from, int to, T[] tmp) {
    if (to - from >= 2) {
      final int middle = (from + to) / 2;
      sort(elements, from, middle, tmp);
      sort(elements, middle, to, tmp);
      merge(elements, from, middle, to, tmp);
      copy(tmp, from, to, elements);
    }
  }

  private static <T extends Comparable<T>> void merge(T[] elements, int from, int middle, int to, T[] tmp) {
    int leftHead = from;
    int rightHead = middle;

    for (int i = from; i < to; i++) {
      if ((leftHead < middle) && (rightHead >= to || (elements[leftHead].compareTo(elements[rightHead]) <= 0))) {
        tmp[i] = elements[leftHead];
        leftHead++;
      } else {
        tmp[i] = elements[rightHead];
        rightHead++;
      }
    }
  }

  private static <T extends Comparable<T>> void copy(T[] source, int from, int to, T[] target) {
    for (int i = from; i < to; i++) {
      target[i] = source[i];
    }
  }
}
