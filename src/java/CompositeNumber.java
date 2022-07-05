public class CompositeNumber {

    public static boolean isCompositeNumber(long num) {
        if(num < 1)
            return false;
        else if (num == 1)
            return true;
        for (int i = 2; (long) i * i <= num; i++)
            if(num % i == 0)
                return true;
        return false;
    }

}
