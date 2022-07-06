package java;

public class BuzzNumber {

    public static boolean isBuzzNumber(long num) {
        if(num < 7)
            return false;
        else return num % 7 == 0 || num % 10 == 7;
    }

}
