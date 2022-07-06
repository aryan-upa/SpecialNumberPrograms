package java;

public class SpyNumber {

    public static boolean isSpyNumber(long num) {
        int sumOfDigit = 0, productOfDigits = 1;

        int dig;
        while(num > 0) {
            dig = (int) num % 10;
            sumOfDigit += dig;
            productOfDigits *= dig;
            num /= 10;
        }

        return sumOfDigit == productOfDigits;
    }

}
