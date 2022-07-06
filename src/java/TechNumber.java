package java;

public class TechNumber {

    private static int countDigits (long num) {
        int len = 0;

        while(num > 0) {
            len++;
            num /= 10;
        }

        return len;
    }

    public static boolean isTechNumber(long num) {
        long num1 = num;
        long num2 = 0;
        int i = 0;

        int len = countDigits(num);
        if(len % 2 != 0)
            return false;

        int countOfDigit = 0;
        while(countOfDigit < len/2) {
            num2 = num2 + num1%10 * (long) Math.pow(10, countOfDigit);
            num1 /= 10;
            countOfDigit++;
        }

        long sqr = (long) Math.pow(num1 + num2, 2);
        return num == sqr;
    }

}
