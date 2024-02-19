public class AbbreviateTwoWords {

//    Write a function to convert a name into initials.
//    This kata strictly takes two words with one space in between them.
//
//    The output should be two capital letters with a dot separating them.
//
//    It should look like this:
//    Sam Harris => S.H
//    patrick feeney => P.F

//    String name;
    public static String abbrevName(String name) {

        String upperCaseName = name.toUpperCase();

        char firstLetter = upperCaseName.charAt(0);
        int indexOfSpace = upperCaseName.indexOf(' ');
        char secondLetter = upperCaseName.charAt(indexOfSpace + 1);

        String result = firstLetter + "." + secondLetter;

        return result;

// Easier solution:
//        name = name.toUpperCase();
//        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }


}
