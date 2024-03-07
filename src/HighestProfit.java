public class HighestProfit {

//    Task
//    Write a function that returns both the minimum and maximum number of the given list/array.
//
//            Examples (Input --> Output)
//            [1,2,3,4,5] --> [1,5]
//            [2334454,5] --> [5,2334454]
//            [1]         --> [1,1]
//    Remarks
//    All arrays or lists will always have at least one element, so you don't need to check the length.
//    Also, your function will always get an array or a list, you don't have to check for null,
//    undefined or similar.
//

    public static int[] minMax(int[] arr) {
        // Your awesome code here

        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] newArr = {min, max};
        return newArr;

    }
}
