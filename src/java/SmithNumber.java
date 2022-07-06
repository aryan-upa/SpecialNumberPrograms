package java;

import java.util.ArrayList;

public class SmithNumber {

    private static int countDigitsSum(long num) {
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    private static ArrayList<Long> returnPrimeFactors(long num) {
        ArrayList<Long> primeFactors = new ArrayList<>();

        for (long i = 2; i * i <= num ; i++) {
            while (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        if(num > 1)
            primeFactors.add(num);

        return primeFactors;
    }

    public static boolean isSmithNumber(long num) {
        int numDigitSum = countDigitsSum(num);
        int factorDigitSum = 0;

        ArrayList<Long> primeFactors = returnPrimeFactors(num);
        if(primeFactors.size() == 1)
            return false;

        for(long val : primeFactors)
            factorDigitSum += countDigitsSum(val);

        return factorDigitSum == numDigitSum;
    }

}
