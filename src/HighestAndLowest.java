public class HighestAndLowest {
//    In this little assignment you are given a string of space separated numbers,
//    and have to return the highest and lowest number.
//
//            Examples
//    highAndLow("1 2 3 4 5")  // return "5 1"
//    highAndLow("1 2 -3 4 5") // return "5 -3"
//    highAndLow("1 9 3 4 -5") // return "9 -5"
//    Notes
//    All numbers are valid Int32, no need to validate them.
//    There will always be at least one number in the input string.
//    Output string must be two numbers separated by a single space, and highest number is first.

    public static String highAndLow(String numbers) {
        // Code here or
        String[] strArray = numbers.split(" ");
        int[] numbersInt = new int[strArray.length];
        for(int i = 0;i < strArray.length;i++) {
            numbersInt[i] = Integer.parseInt(strArray[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int c : numbersInt){
            if (c > max){
                max = c;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int c : numbersInt){
            if (c < min){
                min = c;
            }
        }

        return max + " " + min;
    }
}

