import 'dart:math';

bool isArmstrongNumber(int num) {
  if (num < 0) return false;
  var sum = 0;
  num.toString()
      .split('')
      .forEach((ch) => sum += pow(int.parse(ch), num.toString().length) as int);
  return sum == num;
}
