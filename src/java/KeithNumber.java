package java;

import java.util.ArrayList;

public class KeithNumber {

    public static boolean isKeithNumber(long num) {
        char[] numChars = String.valueOf(num).toCharArray();
        int numberOfSums = numChars.length;
        ArrayList<Long> values = new ArrayList<>();

        for(char c : numChars)
            values.add((long) c - '0');

        long lastAdded = values.get(numberOfSums - 1);
        int startingAdd = 0;
        while(lastAdded <= num) {
            long sum = 0;

            for (int i = 0; i < numberOfSums; i++)
                sum += values.get(i + startingAdd);

            if (sum == num)
                return true;

            values.add(sum);
            lastAdded = sum;
            startingAdd++;
        }

        return false;
    }

}
