bool isAutomorphicNumber(int num) {
  var sqrList = (num * num).toString().split('');
  var numList = num.toString().split('');
  var len = numList.length;
  for (var i = 0; i < len; i++) {
    if (numList.last != sqrList.last) return false;
    numList.removeLast();
    sqrList.removeLast();
  }
  return true;
}
