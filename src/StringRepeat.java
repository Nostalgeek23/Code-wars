public class StringRepeat {
//    Write a function that accepts an integer n and a string s as parameters,
//    and returns a string of s repeated exactly n times.
//
//            Examples (input -> output)
//            6, "I"     -> "IIIIII"
//            5, "Hello" -> "HelloHelloHelloHelloHello"

    public static String repeatStr(final int repeat, final String string) {

        StringBuilder newString = new StringBuilder();
        for (int i = 1; i <= repeat; i++){
            newString.append(string);
        }
        return newString.toString();
    }
}
