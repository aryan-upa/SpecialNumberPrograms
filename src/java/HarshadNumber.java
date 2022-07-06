package java;

public class HarshadNumber {

    public static boolean isHarshadNumber(long num) {
        int sumOfDigits = 0;
        long tempNum = num;

        while(tempNum > 0) {
            sumOfDigits += tempNum % 10;
            tempNum /= 10;
        }

        return num % sumOfDigits == 0;
    }

}
