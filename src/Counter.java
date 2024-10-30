//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts
// the number of sheep present in the array (true means present).

import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public static int countSheeps(Boolean[] arrayOfSheeps) {

    return (int) Arrays.stream(arrayOfSheeps)
            .filter(value -> value != null && value)
            .count();
  }

  public int countSheeps2(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}