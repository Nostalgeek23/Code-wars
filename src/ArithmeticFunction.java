//Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers
//having that operator used on them.
//
//a and b will both be positive integers, and a will always be the first number in the operation,
//and b always the second.
//
//The four operators are "add", "subtract", "divide", "multiply".

class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    // your code here
    return switch (operator) {
      case "add" -> a + b;
      case "subtract" -> a - b;
      case "divide" -> a / b;
      case "multiply" -> a * b;
      default -> 0;
    };
  }
}