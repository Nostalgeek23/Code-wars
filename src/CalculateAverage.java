public class CalculateAverage {
    public static double find_average(int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        if (array.length != 0){
            return sum * 1.0 / array.length;
        } else {
            return 0;
        }
    }
}

