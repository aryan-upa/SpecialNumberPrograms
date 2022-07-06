package java;

public class StrobogrammaticNumber {

    public static boolean isStrobogrammaticNumber(long num) {
        int[] replica = new int[]{0,1,-1,-1,-1,-1,9,-1,8,6};

        char[] numChars = String.valueOf(num).toCharArray();
        int len = numChars.length;

        for (int i = 0; i <= len/2; i++) {
            if(replica[numChars[i] - '0'] != (numChars[len - 1 - i] - '0'))
                return false;
        }

        return true;
    }

}
