#include <iostream>
using namespace std;



bool isSpyNumber(long n) {
    long digit, sum = 0, product = 1;
    while (n > 0) {
        digit = (int)n % 10;
        sum += digit;
        product *= digit;
        n /= 10;
    }

    return sum == product;
}