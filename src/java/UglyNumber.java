public class UglyNumber {

    public static boolean isUglyNumber(long num) {
        if(num < 1)
            return false;

        int[] divisors = new int[]{2,3,5};
        for (int i : divisors) {
            while(num % i == 0) {
                num /= i;
            }
        }

        return num == 1;
    }

}
