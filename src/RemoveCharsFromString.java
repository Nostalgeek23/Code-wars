public class RemoveCharsFromString {
//    Your goal is to create a function that removes the first and last characters of a string.
//    You're given one parameter, the original string.
//    You don't have to worry about strings with less than two characters.

    public static String remove(String str) {

        // your code here
        StringBuilder newstr = new StringBuilder(str);
        newstr.deleteCharAt(0);
        newstr.deleteCharAt(newstr.length() - 1);

        return newstr.toString();
    }
}
