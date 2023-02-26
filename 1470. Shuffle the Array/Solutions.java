class Solution {
    public int[] shuffle(int[] nums, int n) {
        // we initialise a new array
        int[] ans = new int[n*2];
        // we initialise a variable
        int a = 0;
// This loop works such that , take eg [2,5,1,3,4,7]
// So here, ans[0] = nums[0] = 2
// ans[0+1] = nums[0+3] i.e ans[1] = nums[3] = 3
// now a= 0+2 = 2
// So, ans[2] = nums[1] = 5;
// ans[2+1] = nums[1+3] = ans[3] = nums[4] = 4
// now ans = 4;
// So, ans[4] = nums[2] = 1;
// ans[5] = nums[2+3] =  ans[5] = nums[5] = 7
//  so, ans = [2,3,5,4,1,7]


        for(int i = 0; i<n;i++){
            ans[a] = nums[i];
            ans[a+1] = nums[i+n];

            a+=2;
            
        }
        return ans;
        
    }
}