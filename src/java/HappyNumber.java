import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappyNumber(long num) {
        HashSet<Long> set = new HashSet<>();
        set.add(num);
        long sqrSum;
        while(true) {
            sqrSum = 0;
            for (char c : String.valueOf(num).toCharArray())
                sqrSum += (long) (c - '0') * (c - '0');

            if(sqrSum == 1)
                return true;
            else if (set.contains(sqrSum))
                return false;
            else {
                set.add(sqrSum);
                num = sqrSum;
            }
        }
    }

}
