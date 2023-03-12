# 204. Count Primes

Given an integer `n`, return the number of prime numbers that are strictly less than `n`.

 

Example 1:
````
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
````

Example 2:
````
Input: n = 0
Output: 0
````

Example 3:
````
Input: n = 1
Output: 0
````

Constraints:

- `0 <= n <= 5 * 106`


# Solution

This is a Java solution for finding the number of prime numbers less than a given integer `n`. The approach used in this solution is called the `Sieve of Eratosthenes`.

The `countPrimes` method takes an integer `n` as input and returns an integer, which is the number of prime numbers less than `n`.

The method starts by creating a boolean array `notPrime` of size `n` and initializing all the values to `false`. This array is used to keep track of whether a number is prime or not.

The method then initializes a variable count to `0` to keep track of the number of primes found.

The method then iterates through all the integers from `2` to `n-1`. If the current number `i``is marked as `false` in the `notPrime` array, it means that `i` is a prime number, and the `count` variable is incremented.

Then, the method iterates through all the multiples of `i` less than `n` and marks them as `true` in the` notPrime` array. This is done to eliminate all the multiples of `i` since they cannot be prime.

Finally, the method returns the `count` variable, which contains the number of prime numbers less than `n`.

Overall, this algorithm has a time complexity of `O(n log log n)`, which is faster than the naive approach of testing each number for primality.


## Example :

n = 10

- Initially, we create a boolean array `notPrime` of size `n` (i.e., 10) and initialize all the values to `false`:

````
notPrime = [false, false, false, false, false, false, false, false, false, false]
````

We also initialize the variable `count` to `0`.


Now, we start iterating from `i=2` to `i<n`, which means we will iterate from 2 to 9.

- At `i=2`, `notPrime[2]` is `false`, so we increment `count` to 1. Then, we mark all the multiples of `2` as true in the `notPrime` array:


````
notPrime = [false, false, true, false, true, false, true, false, true, false]
````

#### Note :
We only mark multiples of 2 starting from `2*2=4` because 2 itself is a prime number.

- At i=3, notPrime[3] is false, so we increment count to 2. Then, we mark all the multiples of 3 as true in the notPrime array:

````
notPrime = [false, false, true, false, true, false, true, true, true, false]
````

#### Note :
We only mark multiples of 3 starting from `3*2=6` because we have already marked multiples of 2.

At `i=4`, `notPrime[4]` is `true`, so we do nothing.

At `i=5`, `notPrime[5]` is `false`, so we increment count to 3. Then, we mark all the multiples of 5 as true in the notPrime array:

````
notPrime = [false, false, true, false, true, true, true, true, true, false]
````

#### Note :
We only mark multiples of 5 starting from 5*2=10 because we have already marked multiples of 2 and 3.

At `i=6`, `notPrime[6]` is `true`, so we do nothing.

At `i=7`, `notPrime[7]` is `false`, so we increment `count` to 4. Then, we mark all the multiples of 7 as `true` in the `notPrime` array:

````
notPrime = [false, false, true, false, true, true, true, true, true, true]
````

#### Note :
We only mark multiples of 7 starting from 7*2=14 because we have already marked multiples of 2, 3, and 5.

At `i=8`, `notPrime[8]` is `true`, so we do nothing.

At `i=9`, `notPrime[9]` is `true`, so we do nothing.

Finally, we return `count`, which is equal to 4. Therefore, the number of prime numbers less than 10 is 4 (i.e., 2, 3, 5, and 7).

I hope this helps you understand how the code works!