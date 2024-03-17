import org.apache.commons.lang3.StringUtils;
//Check to see if a string has the same amount of 'x's and 'o's.
// The method must return a boolean and be case insensitive.
// The string can contain any char.
//
//Examples input/output:
//
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false
public class ExesAndOhs {

    public static boolean getXO (String str) {

        // Good Luck!!
        int countX = StringUtils.countMatches(str.toLowerCase(), "x");
        int countO = StringUtils.countMatches(str.toLowerCase(), "o");

        return (countX == countO);
    }
}
