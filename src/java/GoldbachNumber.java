package java;

public class GoldbachNumber {

    private static boolean isPrime(long num) {
        if(num <= 1)
            return false;
        else if (num == 2 || num == 3)
            return true;
        else if (num % 2 == 0 || num % 3 == 0)
            return false;
        else {
            for (int i = 5; (long) i * i < num; i += 6)
                if (num % i == 0 || num % (i+2) == 0)
                    return false;
        }
        return true;
    }

    public static boolean isGoldbachNumber(long num) {
        if(num <= 4 || num % 2 != 0)
            return false;
        else {
            long firstPrime;
            long secondPrime;
            for (int i = 3; (long) i <= num/2; i++) {
                if(isPrime(i)) {
                    firstPrime = i;
                    secondPrime = num - firstPrime;
                    if(isPrime(secondPrime)) {
                        System.out.println(firstPrime + " " + secondPrime);
                        return true;
                    }
                }
            }
        }
        return false; // This conjecture is true for all Even Integers upto 4 * 10^18.
    }

}
