const isSpyNumber = (num) => {
  let sumOfDigits = 0;
  let productOfDigits = 1;

  while (num > 0) {
    const dig = num % 10;
    sumOfDigits += dig;
    productOfDigits *= dig;
    num = Math.floor(num / 10);
  }

  return sumOfDigits === productOfDigits;
}

export default isSpyNumber;
