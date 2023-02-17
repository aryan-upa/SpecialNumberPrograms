package main

func isHappy(n int) bool {
	slow, fast := n, n

	for {
		slow = sumOfSquares(slow)
		fast = sumOfSquares(sumOfSquares(fast))

		if slow == 1 || fast == 1 {
			return true
		}

		// Floyd's cycle detection
		if slow == fast {
			return false
		}
	}
}

func sumOfSquares(n int) int {
	sum := 0
	for n > 0 {
		sum += n * n
		n /= 10
	}

	return sum
}

func main() {
	n := 19
	println(n, "is happy number:", isHappy(n))
}
