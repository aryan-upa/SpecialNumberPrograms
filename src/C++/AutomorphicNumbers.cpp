#include<iostream>
using namespace std;

bool isAutomorphic(long n){
    int sqr = n*n;
    while(n != 0){
        if(sqr % 10 != n % 10){
            return false;
        }
        n /= 10;
        sqr /= 10;
    }
    return true;
}
