#include <iostream>
using namespace std;
bool isArmstrong(long n);

int main(){
    int n,flag;
//     cout << "Enter a number: ";
//     cin >> n;
//     if (n < 0)
//     {
//         return false;
//     }
//     int sum = 0;
//     int temp = n;
//     while (temp > 0){
//         int digit = temp % 10;
//         sum += digit * digit * digit;
//         temp /= 10;
//     }
//     if (sum == n)
//     {
//         cout << "Yes";
//     }
//     else
//     {
//         cout << "No";
//     }
//     return 0;
    cout << "Enter a number: ";
    cin >> n;
    flag = isArmstrong(n);
    if(flag == true)
        cout<<"Number is an Armstrong Number.";
    else
        cout<<"Number is not an Armstrong Number.";
        
}

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