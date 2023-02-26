class Solution {
    public int[] getConcatenation(int[] nums) {
// we initialise a new array
    int[] ans = new int[2*nums.length];
    // in the for loop 
    // let's take eg [1,2,1] ==> 
    // ans[0] = 1
    // ans[0+3] = ans[3] = 1
    // similarly ans[2] and ans[2+3] = ans[5] = 2
    // and ans[3] and ans[6] = 1

    for( int i = 0; i<nums.length;i++){
        ans[i] = nums[i];
        ans[i + nums.length] = nums[i];
    }
    return ans;
}
}