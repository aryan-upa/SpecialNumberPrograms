package java;

public class SunnyNumber {

    public static boolean isSunnyNumber(long num) {
        double sqrtD = Math.sqrt(num + 1);
        long sqrt = (long) sqrtD;

        return sqrt == sqrtD;
    }

}
