package java;

import java.util.Arrays;

public class UniqueNumber {

    public static boolean isUniqueNumber(long num) {
        num = Math.abs(num);
        boolean[] isDigitPresent = new boolean[10];
        Arrays.fill(isDigitPresent, false);

        while(num > 0) {
            if(isDigitPresent[(int) num % 10])
                return false;
            isDigitPresent[(int) num % 10] = true;
            num /= 10;
        }

        return true;
    }

}
