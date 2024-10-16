public class BasicCalc {
//
//  Write a function called calculate that takes 3 values. The first and third values are numbers.
//  The second value is a character. If the character is "+" , "-", "*", or "/", the function will return the result of
//  the corresponding mathematical function on the two numbers. If the string is not one of the specified characters,
//  the function should return null (throw an ArgumentException in C#).

//  detailed way
  public static Double calculate(final double numberOne, final String operation, final double numberTwo)
  {
    Double Result;

      switch (operation) {
        case "+" -> Result = numberOne + numberTwo;
        case "-" -> Result = numberOne - numberTwo;
        case "*" ->
        {
          if (numberOne == 0 || numberTwo == 0) {
            Result = 0.0;
          } else {
            Result = numberOne * numberTwo;
          }
        }
        case "/" ->
        {
          if (numberTwo != 0) {
            Result = numberOne / numberTwo;
          } else {
            Result = null;
          }
        }
        default -> Result = null;
      }

    return Result;
  }

//  shorter way
public static Double calculate2(final double x, final String op, final double y) {
  return switch (op) {
    case "+" -> x + y;
    case "-" -> x - y;
    case "*" -> x * y + 0.0;
    case "/" -> y == 0 ? null : x / y;
    default -> null;
  };
}
}

