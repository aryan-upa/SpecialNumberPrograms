bool isUglyNumber(int num) {
  if (num < 1) return false;
  var divisors = [2, 3, 5];
  for (var i in divisors) {
    while (num % i == 0) num = (num / i) as int;
  }
  return num == 1;
}
