#include<iostream>
#include<cmath>
using namespace std;
int countDigits(int n);
bool isDisariumNumber(long n);


int countDigits(int n){
    int count = 0;
    while (n != 0) {
        n = n / 10;
        count++;
    }
    return count;
}

bool isDisariumNumber(long n){
    int count = countDigits(n);
    int sum = 0;
    int temp = n;
    while (temp != 0){
        int digit = temp % 10;
        sum += pow(digit, count--);
        temp = temp / 10;
    }
    if (sum == n)
        return true;
    else
        return false;
}