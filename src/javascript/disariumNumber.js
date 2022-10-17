function countDigits(num) {
    let len = 0;

    while(num > 0) {
        len++;
        num = Math.floor(num/10);
    }

    return len;
}

const isDisariumNumber = (num) => {
    let tempNum = num;
    let sum = 0;
    let digits = countDigits(num);

    while(tempNum > 0) {
        sum += Math.pow(tempNum%10, digits--);
        tempNum = Math.floor(tempNum/10);
    }

    return sum === num;
}

export default isDisariumNumber;
