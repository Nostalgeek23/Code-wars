public class Transportation {
//
//    You will need a rental car in order for you to get around in your vacation.
//    The manager of the car rental makes you some good offers.
//
//    Every day you rent the car costs $40. If you rent the car for 7 or more days,
//    you get $50 off your total. Alternatively, if you rent the car for 3 or more days,
//    you get $20 off your total.
//
//    Write a code that gives out the total amount for different days(d).
    public static int rentalCarCost(int d) {
        // Your solution here
        int result = d *40;
        if (d >= 7) {
            result -= 20;
        } else if (d >= 3) {
            result -= 50;
        }
        return result;
    }
}
