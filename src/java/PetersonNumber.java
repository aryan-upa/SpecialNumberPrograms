package java;

public class PetersonNumber {

    private static long countFactorial(long num) {
        long fact = 1;

        while(num > 0)
            fact *= num--;

        return fact;
    }

    public static boolean isPetersonNumber(long num) {
        long tempNum = num;
        long sum = 0;

        while(tempNum > 0) {
            sum += countFactorial(tempNum % 10);
            tempNum /= 10;
        }

        return sum == num;
    }

}
