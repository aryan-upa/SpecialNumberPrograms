#include<iostream>
using namespace std;
bool isAutomorphic(long n);
int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    if(isAutomorphic(num)) {
        cout<<num<<" is an Automorphic Number.";
    }
    else {
        cout<<num<<" is not an Automorphic Number.";
    }
}

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