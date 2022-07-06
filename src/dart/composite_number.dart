bool isCompositeNumber(int num) {
  if (num < 1)
    return false;
  else if (num == 1) return true;
  for (var i = 2; i * i <= num; i++) {
    if (num % i == 0) return true;
  }
  return false;
}
