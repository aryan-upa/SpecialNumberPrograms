#include<iostream>
using namespace std;

bool isBuzzNumber(long n){
    if (n<7) 
        return false;
    else if(n%7==0 || n%10==7) 
        return true;
    else
        return false;
}