#include <iostream>
using namespace std;

bool isArmstrong(long n) {
    bool isArms;
    if (n < 0) {
        return false;
    }
    int sum = 0;
    int temp = n;
    while (temp > 0){
        int digit = temp % 10;
        sum += digit * digit * digit;
        temp /= 10;
    }
    return sum == n;
}
