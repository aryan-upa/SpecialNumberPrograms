#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n)
{

	for (int divisor = 2; divisor * divisor <= n; divisor++)
	{
		if (n % divisor == 0)
		{
			return false;
		}
	}

	return (n >= 2);
}
