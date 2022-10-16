#include <iostream>

using namespace std;

bool isBouncyNumber(long n);
bool isBouncyNumber(long n) {
    bool isdecreasing = false, isincreasing = false;
    int digits[20] = {0};
    for (int i = 0; i < 10; i++) {
        digits[i] = n % 10;
        n /= 10;
    }

    for (int i = 0; i < 10; i++) {
        if (digits[i + 1] < digits[i])
            isdecreasing = true;
        if (digits[i + 1] > digits[i])
            isincreasing = true;
    }
    return isincreasing && isdecreasing;
}