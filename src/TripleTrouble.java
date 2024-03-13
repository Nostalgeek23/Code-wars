public class TripleTrouble {
//    Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
//    Taking the first letter of all of the inputs and grouping them next to each other.
//    Do this for every letter, see example below!
//
//    E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//
//    Note: You can expect all of the inputs to be the same length.
    public static String tripleTrouble(String one, String two, String three) {
        // Solution
        String str = "";
        for (int i=0; i < one.length(); i++) {
            str+= String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) + String.valueOf(three.charAt(i));
        }
        return str;
    }
}
