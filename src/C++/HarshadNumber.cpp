#include <iostream>

using namespace std;
bool isHarshadNumber(long n);

int main()
{
    cout << "Harshad Number" << endl;
    if (isHarshadNumber(24))
        cout << "Yes , it is harshad Number" << endl;
    else
        cout << "not";
}

bool isHarshadNumber(long n)
{
    int sumOfDigits = 0;
    long tempNum = n;

    while (tempNum > 0)
    {
        sumOfDigits += tempNum % 10;
        tempNum /= 10;
    }

    return n % sumOfDigits == 0;
}