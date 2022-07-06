import java.util.HashSet;

public class AutomorphicNumber {

    public static boolean isAutomorphicNumber(long num) {
        HashSet<Integer> alreadyEndedWithDigit = new HashSet<>();
        int mul = 1;
        long tempNum;
        while(true) {
            tempNum = num;
            long sqr = mul * tempNum * tempNum;
            if(alreadyEndedWithDigit.contains((int) sqr%10))
                return false;
            else
                alreadyEndedWithDigit.add((int) sqr % 10);
            while(tempNum > 0) {
                if(sqr % 10 != tempNum % 10) {
                    break;
                }
                sqr /= 10;
                tempNum /= 10;
            }
            if(tempNum == 0) {
                return true;
            }
            mul++;
        }
    }

}
