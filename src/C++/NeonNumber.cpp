#include <iostream>
using namespace std;


bool isNeonNumber(long n) {
    long sqr = n * n;
    long sum = 0;
    while (sqr > 0) {
        sum = sum + sqr % 10;
        sqr = sqr / 10;
    }

    return sum == n;
}
