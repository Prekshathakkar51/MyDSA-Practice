class Solution {

    public int[] buildArray(int[] nums) {
        // int n = nums.length;
        
        // for(int i=0; i<n; i++){
            // this is done to keep both old and new value together. 
            // going by the example of [5,0,1,2,3,4]
            // after this nums[0] will be 5 + 6*(4%6) = 5 + 24 = 29;
            // now for next index calulation we might need the original value of num[0] which can be obtain by num[0]%6 = 29%6 = 5;
            // if we want to get just he new value of num[0], we can get it by num[0]/6 = 29/6 = 4
        //     nums[i] = nums[i] + n*(nums[nums[i]] % n);
        // }
        
        // for(int i=0; i<n; i++){
        //     nums[i] = nums[i]/n;
        // }
        
        // return nums;

// as the 1st constraint is given that '1 <= nums.length <= 1000'
// This doesnt use the int capacity , we can use ither bits to store info

// meta = num1 + [some_const]*num2
// some_const , can be either 1001(>1000), or larger prime no. than 1000, or length of array+1.
// num1 = meta % some_const
// num2 = meta/some_const

        int CONST = 1001;
        for(int i = 0; i<nums.length;i++){
            int a = nums[i];
            int b = nums[a]%CONST;
            nums[i] = a + b*CONST;
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] /= CONST;
        }
        return nums;
    }

    // This gives O(n) space complexity
//     public int[] buildArray(int[] nums) {
// // a new array to store the result
//         int[] ans = new int[nums.length];
        
//         for(int i = 0; i< ans.length; i++){
           
//             ans[i] = nums[nums[i]];
//         }
//         return ans;
//     }

// https://www.cuemath.com/numbers/euclids-division-algorithm/
    
}

    
