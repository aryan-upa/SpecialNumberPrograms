#include <iostream>

using namespace std;
bool isUglyNumber(long n);

bool isUglyNumber(long n) {
    int div[3] = {2, 3, 5};

    if (n < 1) {
        return false;
    }
    for (int i : div) {
        while (n % i == 0) {
            n /= i;
        }
    }

    return (n == 1);
}