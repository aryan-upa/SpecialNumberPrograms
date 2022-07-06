package java;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(long num) {
        if(num < 0)
            return false;

        String numStr = String.valueOf(num);
        int noOfDigits = numStr.length();
        long sum = 0;

        for(char c : numStr.toCharArray())
            sum = sum + (long) Math.pow(c-'0', noOfDigits);

        return sum == num;
    }

}
