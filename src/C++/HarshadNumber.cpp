#include <iostream>
<<<<<<< HEAD
using namespace std;
bool isHarshadNumber(long n);

=======

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

>>>>>>> 51813d2082c71ddf2bddae7cbd6cbc4adcfdf1dd
bool isHarshadNumber(long n)
{
    int sumOfDigits = 0;
    long tempNum = n;
<<<<<<< HEAD
=======

>>>>>>> 51813d2082c71ddf2bddae7cbd6cbc4adcfdf1dd
    while (tempNum > 0)
    {
        sumOfDigits += tempNum % 10;
        tempNum /= 10;
    }

    return n % sumOfDigits == 0;
}