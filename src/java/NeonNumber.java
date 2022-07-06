package java;

public class NeonNumber {

    public static boolean isNeonNumber(long num) {
        long sqrSum = (long) Math.pow(num,2);
        int sum = 0;

        while(sqrSum > 0) {
            sum += sqrSum % 10;
            sqrSum /= 10;
        }

        return num == sum;
    }

}
