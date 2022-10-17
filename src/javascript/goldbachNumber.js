function isPrime(num) {
    if(num <= 1)
        return false;
    else if (num === 2 || num === 3)
        return true;
    else if (num % 2 === 0 || num % 3 === 0)
        return false;
    else {
        for (let i = 5; i * i < num; i += 6)
        if (num % i === 0 || num % (i+2) === 0)
            return false;
    }
    return true;
}

const isGoldbachNumber = (num) => {
    if(num <= 4 || num % 2 !== 0)
        return false;
    else {
        let firstPrime;
        let secondPrime;
        for (let i = 3; i <= Math.floor(num/2); i++) {
            if(isPrime(i)) {
                firstPrime = i;
                secondPrime = num - firstPrime;
                if(isPrime(secondPrime))
                    return true;
            }
        }
    }
    return false; // This conjecture is true for all Even Integers upto 4 * 10^18.
}

export default isGoldbachNumber;
