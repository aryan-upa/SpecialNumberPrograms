package java;

public class KrishnamurthyNumber {

    private static long factorial(long num) {
        long fact = 1;
        while(num > 0)
            fact *= num--;
        return fact;
    }

    public static boolean isKrishnamurthyNumber(long num) {
        long tempNum = num;
        long sum = 0;

        while(tempNum > 0) {
            sum += factorial(tempNum % 10);
            tempNum /= 10;
        }

        return sum == num;
    }

}
