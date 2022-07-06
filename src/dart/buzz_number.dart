bool isBuzzNumber(int num) {
  if (num < 7)
    return false;
  else
    return num % 7 == 0 || num % 10 == 7;
}
