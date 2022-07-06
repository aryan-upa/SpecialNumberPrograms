package java;

public class PrimeNumber {

    public static boolean isPrime(long num) {
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

}
