import java.util.HashMap;

public class SwitchItUp {
//  When provided with a number between 0-9, return it in words.
//          Input :: 1
//  Output :: "One".

//  switch way
  public static String switchItUp(int number)
  {
    return switch (number) {
      case 0 -> "Zero";
      case 1 -> "One";
      case 2 -> "Two";
      case 3 -> "Three";
      case 4 -> "Four";
      case 5 -> "Five";
      case 6 -> "Six";
      case 7 -> "Seven";
      case 8 -> "Eight";
      case 9 -> "Nine";
      default -> throw new IllegalArgumentException();
    };
  }

//  Arrays

  public static String switchItUpArray(int number) {
    return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
  }

//  Hashmap

  private static final HashMap<Integer, String> digits;
  static
  {
    digits = new HashMap<>();
    digits.put(0, "Zero");
    digits.put(1, "One");
    digits.put(2, "Two");
    digits.put(3, "Three");
    digits.put(4, "Four");
    digits.put(5, "Five");
    digits.put(6, "Six");
    digits.put(7, "Seven");
    digits.put(8, "Eight");
    digits.put(9, "Nine");
  }

  public static String switchItUpHashMap(int number)
  {
    return digits.get(number);
  }
}