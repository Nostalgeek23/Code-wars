public class NumberToReversedArray {
  public static int[] digitize(long n) {
    // Code here

    String number = String.valueOf(n);

    int[] reversedDigits = new int[number.length()];

    for (int i = 0; i < number.length(); i++) {
      reversedDigits[i] = Character.getNumericValue(number.charAt(number.length() - 1 - i));
    }

    return reversedDigits;
  }

//  shorter way
  public static int[] digitizeShort(long n) {
    return new StringBuilder().append(n)
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
  }
}
