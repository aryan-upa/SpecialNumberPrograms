const isBuzzNumber = (num) => {
  if (num < 7) return false;

  return num % 7 == 0 || num % 10 == 7;
}

export default isBuzzNumber;
