const isUniqueNumber = (num) => {
  num = Math.abs(num);
  const isDigitPresent = []

  while(num > 0) {
    if (isDigitPresent[num % 10])
        return false;

    isDigitPresent[num % 10] = true;
    num = Math.floor(num / 10);
  }

  return true;
}

export default isUniqueNumber;
