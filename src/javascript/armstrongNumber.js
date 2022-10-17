const isArmstrongNumber = (num) => {
    let sum = 0;
    let temp = num;

    while (temp > 0) {
        sum += Math.pow(temp%10,3);
        temp = Math.floor(temp/10);
    }

    return sum === num;
}

export default isArmstrongNumber;