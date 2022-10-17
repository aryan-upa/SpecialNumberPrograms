const isAutomorphicNumber = (num) => {
    let alreadyEndedWithDigit = new Set();
    let mul = 1;
    let tempNum;
    while(true) {
        tempNum = num;
        let sqr = mul * tempNum * tempNum;
        if(alreadyEndedWithDigit.has(sqr%10))
        return false;
    else
        alreadyEndedWithDigit.add(sqr % 10);
        while(tempNum > 0) {
            if(sqr % 10 !== tempNum % 10) {
                break;
            }
            sqr = Math.floor(sqr/10);
            tempNum = Math.floor(tempNum/10);
        }
        if(tempNum === 0) {
            return true;
        }
        mul++;
    }
}

export default isAutomorphicNumber;
