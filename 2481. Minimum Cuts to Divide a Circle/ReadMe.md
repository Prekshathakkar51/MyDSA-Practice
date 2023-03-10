# 2481. Minimum Cuts to Divide a Circle

### A valid cut in a circle can be:

### A cut that is represented by a straight line that touches two points on the edge of the circle and passes through its center, or
### A cut that is represented by a straight line that touches one point on the edge of the circle and its center.
### Some valid and invalid cuts are shown in the figures below.

<img src="https://user-images.githubusercontent.com/95307102/224220392-2dbed672-121a-4429-ae28-d07c385e3ffb.png">

### Given the integer n, return the minimum number of cuts needed to divide a circle into n equal slices.


 
Example 1:

<img src="https://user-images.githubusercontent.com/95307102/224220467-6562f00a-73ca-415a-aa98-1430e1a68e58.png">

````
Input: n = 4
Output: 2
Explanation: 
The above figure shows how cutting the circle twice through the middle divides it into 4 equal slices.
```` 


Example 2:

<img src="https://user-images.githubusercontent.com/95307102/224220529-e5b1a1f7-b5ac-400d-bfba-e745a534557a.png">

```` 
Input: n = 3
Output: 3
Explanation:
At least 3 cuts are needed to divide the circle into 3 equal slices. 
It can be shown that less than 3 cuts cannot result in 3 slices of equal size and shape.
Also note that the first cut will not divide the circle into distinct parts.
````  

Constraints:

- 1 <= n <= 100



