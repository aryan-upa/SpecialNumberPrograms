#include <iostream>

using namespace std;
bool isPerfectNumber(long n);

bool isPerfectNumber(long n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
        if (n % i == 0) {
            sum += i;
        }
    }

    return sum == n;
}