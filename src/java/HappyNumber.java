package java;

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
------------------------------------------
public class HappyNumber
{
    public static void main(String[] args)
    {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}
-----------------------------
