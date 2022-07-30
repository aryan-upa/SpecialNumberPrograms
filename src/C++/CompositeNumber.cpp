#include<iostream>
using namespace std;
bool isComposite(long n);

bool isComposite(long n){
    int count= 0;
    for(int i = 2; i<=n; i++){
        if(n%i==0){
            count++;
        }
    }
    
    if(count>2){
        return true;
    }
    else{
        return false;
    }
}