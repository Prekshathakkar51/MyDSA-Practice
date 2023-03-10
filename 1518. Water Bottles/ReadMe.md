# 1518. Water Bottles

### There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

### The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

 

Example 1:

<img src="https://user-images.githubusercontent.com/95307102/224228983-4bf330f3-f82f-4d32-841e-e7ffa52760a1.png">


````
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
````
Example 2:

<img src ="https://user-images.githubusercontent.com/95307102/224229029-ed600c1d-b0c5-4438-b556-a1de16f575a7.png">

````
Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.
```` 

Constraints:

- 1 <= numBottles <= 100
- 2 <= numExchange <= 100
