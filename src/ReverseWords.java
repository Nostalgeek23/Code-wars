import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String str){
        //write your code here...



        String [] array = str.split(" ");
        String reversed = "";
        for (int i = 0; i < array.length; i++ ) {
            reversed = array[i] + " " +reversed;
        } return reversed.trim();
    }
}
