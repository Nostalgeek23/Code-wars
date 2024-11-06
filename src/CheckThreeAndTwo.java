//Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran, Chars in Haskell),
//check if the array contains three and two of the same values.

import java.util.HashMap;
import java.util.Map;

public class CheckThreeAndTwo {

  public boolean checkThreeAndTwo(char[] chars) {

    Map<Character, Integer> countMap = new HashMap<>();

    for (char aChar : chars) {
      countMap.put(aChar, countMap.getOrDefault(aChar, 0) + 1);
    }

    return countMap.containsValue(3) && countMap.containsValue(2);
  }

//long way
  public boolean checkThreeAndTwoLong(char[] chars) {
    // your code
    int countA = 0;
    int countB = 0;
    int countC = 0;

    for (char aChar : chars) {
      if (aChar == 'a') {
        countA++;
      }
      if (aChar == 'b') {
        countB++;
      }
      if (aChar == 'c') {
        countC++;
      }
    }

    boolean result = false;

    if (countA == 2 && (countB == 3 || countC == 3)){
      result = true;
    }
    if (countB == 2 && (countA == 3 || countC == 3)){
      result = true;
    }
    if (countC == 2 && (countA == 3 || countB == 3)){
      result = true;
    }

    return result;
  }
}