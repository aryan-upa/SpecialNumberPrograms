#include <math.h>
#include <iostream>

using namespace std;


bool isSunnyNumber(long n) {
    double sqrD = sqrt(n + 1);
    long sqr = (long)sqrD;
    return sqr == sqrD;
}