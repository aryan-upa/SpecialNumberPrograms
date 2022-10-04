#include <iostream>

using namespace std;
bool isPrime(long n);
bool isGoldBachNumber(long n);

bool isPrime(long n)
{
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

bool isGoldBachNumber(long n)
{
    if (n <= 4 || n % 2 != 0)
        return false;
    else
    {
        long fprime, sprime;
        for (int i = 3; i <= n / 2; i++)
        {
            if (isPrime(i))
            {
                fprime = i;
                sprime = n - i;
                if (isPrime(sprime))
                {
                    // this line will print odd numbers pair
                    cout << fprime << " + " << sprime << endl;
                    return true;
                }
            }
        }
    }
    return false;
}