#include<iostream>
using namespace std;
bool isComposite(long n);

bool isComposite(long n){
    if(n<1){
        return false;
    }
    int count= 0;
    for(int i = 1; i*i<=n; i++){
        if(n%i==0){
            count++;
        }
    }
    if(count>2){
        return true;e
    }
    else{
        return false;
    }
}