#include<iostream>
#include <vector>
using namespace std;

int getDigitSum(int num){
    int sum = 0;
    int digit = 0;

    while(num > 0){
        digit = num % 10;
        sum += digit;
        num /= 10;
    } 
    
    return sum;
}

vector<int> getPrimeFactors(int num){
    vector<int> primeFactors = {};
    for (int i = 2;i*i <= num;i++){
        while( num % i == 0){
            primeFactors.push_back(i);
            num /= i;
        }
    }
    if( num > 1) {
        primeFactors.push_back(num);
    }

    return primeFactors;
}

bool isSmithNumber(int num){

    int numDigitSum = getDigitSum(num);
    int factorDigitSum = 0;

    vector<int> primes = getPrimeFactors(num);
    if(primes.size() == 1 && primes[0] == num)
        return false;

    for(int i : primes)
        factorDigitSum += getDigitSum(i);

    
    return factorDigitSum == numDigitSum;
}
