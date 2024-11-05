//Challenge:
//Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the
//sorted (ascending) order.
//
//Example:
//Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

  public static int[] flattenAndSort(int[][] array) {
    List<Integer> list = new ArrayList<>();

    for (int[] ints : array) {
      for (int anInt : ints) {
        list.add(anInt);
      }
    }
    Collections.sort(list);

    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }

    return result;
  }

//  shorter way:
  public static int[] flattenAndSortShort(int[][] array) {
    return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
  }
}
