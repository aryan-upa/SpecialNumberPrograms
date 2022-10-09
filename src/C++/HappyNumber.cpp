#include <iostream>

using namespace std;
bool isHappyNumber(long n);
bool isHappyNumber(long n) {
    long sum = 0, rem;
    while (sum != 1 && sum != 4) {
        sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = rem * rem;
            n /= 10;
        }
        n = sum;
    }

    if (sum == 1)
        return true;
    else
        return false;
}
