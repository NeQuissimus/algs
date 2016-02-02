package alg;

public final class QuickSort {
  private QuickSort() {}

  public static <T extends Comparable<T>> T[] sort(T[] elements) {
    return sort(elements, 0, elements.length - 1);
  }

  public static <T extends Comparable<T>> T[] sort(T[] elements, int start, int end) {
    if (start < end) {
      final int pivotPosition = partition(elements, start, end);
      sort(elements, start, pivotPosition - 1);
      sort(elements, pivotPosition + 1, end);
    }

    return elements;
  }

  private static <T extends Comparable<T>> int partition(T[] elements, int start, int end) {
    final T pivot = elements[end];
    int position = start;

    for (int i = start; i < end; i++) {
      if (elements[i].compareTo(pivot) <= 0) {
        final T tmp = elements[i];
        elements[i] = elements[position];
        elements[position] = tmp;

        position++;
      }
    }

    elements[end] = elements[position];
    elements[position] = pivot;

    return position;
  }
}
