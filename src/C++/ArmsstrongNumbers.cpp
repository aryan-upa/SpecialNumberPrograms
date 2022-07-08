#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    if (n < 0)
    {
        return false;
    }
    int sum = 0;
    int temp = n;
    while (temp > 0)
    {
        int digit = temp % 10;
        sum += digit * digit * digit;
        temp /= 10;
    }
    if (sum == n)
    {
        cout << "Yes";
    }
    else
    {
        cout << "No";
    }
    return 0;
}