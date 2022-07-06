package java;

public class BouncyNumber {

    public static boolean isBouncyNumber(long num) {
        char[] numStr = String.valueOf(num).toCharArray();
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        for (int i = 0; i < numStr.length - 1; i++) {
            if (numStr[i] > numStr[i+1])
                isDecreasing = true;
            if (numStr[i] < numStr[i+1])
                isIncreasing = true;
        }

        return isDecreasing && isIncreasing;
    }

}
