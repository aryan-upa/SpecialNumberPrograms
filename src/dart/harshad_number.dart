bool isHarshadNumber(int num) {
  var sumOfDigits = 0;
  num.toString().split('').forEach((ch) => sumOfDigits += int.parse(ch));
  return num % sumOfDigits == 0;
}
