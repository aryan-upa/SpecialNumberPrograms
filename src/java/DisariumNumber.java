package java;

public class DisariumNumber {

    private static int countDigits(long num) {
        int len = 0;

        while(num > 0) {
            len++;
            num /= 10;
        }

        return len;
    }

    public static boolean isDisariumNumber(long num) {
        long tempNum = num;
        long sum = 0;
        int digits = countDigits(num);

        while(tempNum > 0) {
            sum += Math.pow(tempNum%10, digits--);
            tempNum /= 10;
        }

        return sum == num;
    }

}
