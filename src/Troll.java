
    public class Troll {
//        Trolls are attacking your comment section!
//        A common way to deal with this situation is to remove all of the vowels from the trolls' comments,
//        neutralizing the threat.
//        Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//        Note: for this kata y isn't considered a vowel.
        public static String disemvowel(String str) {
            // Code away...
            String strNew = str.replaceAll("([euioaEUIOA])", "");
            return strNew;
        }

    }

