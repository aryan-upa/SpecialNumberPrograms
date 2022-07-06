package java;

public class PerfectNumber {

    public static boolean isPerfectNumber(long num) {
        long sum = 0;

        for (long i = 1; i * i <= num ; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num/i)
                    sum += num/i;
            }
        }

        return sum-num == num;
    }

}
