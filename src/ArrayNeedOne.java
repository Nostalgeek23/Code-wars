//You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
//
//Array can contain numbers or strings. X can be either.
//
//Return true if the array contains the value, false if not.

import java.util.Arrays;

public class ArrayNeedOne {

  public static boolean check(Object[] a, Object x) {
    // Your code here
    for (int i = 0; i < a.length; i++) {
      if (a[i].equals(x)) {
        return true;
      }
    }
    return false;
  }


  public static boolean check2(Object[] a, Object x) {
    return Arrays.asList(a).contains(x);
  }

  public static boolean check3(Object[] a, Object x) {
    return Arrays.stream(a)
            .anyMatch(i -> x.equals(i));
  }
}