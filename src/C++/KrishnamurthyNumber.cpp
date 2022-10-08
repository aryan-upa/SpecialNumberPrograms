#include <iostream>

using namespace std;
bool isKrishanMurthyNumber(long n);
int fact(long n);
int main() {
    if (isKrishanMurthyNumber(145) == true) {
        cout << "True" << endl;
    } else {
        cout << "False";
    }
}

int fact(long n) {
    int fact = 1;
    while (n > 0) {
        fact *= n--;
    }
    return fact;
}

bool isKrishanMurthyNumber(long n) {
    long temp = n;
    long sum = 0;
    while (temp > 0) {
        sum += fact(temp % 10);
        temp /= 10;
    }
    return sum == n;
}