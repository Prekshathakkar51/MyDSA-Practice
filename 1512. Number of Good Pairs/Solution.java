class Solution {

// Time COmplexity : O(n)
//  This is using counting algo 
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int count[] = new int[101];
        for (int a: nums) {
            result += count[a]++;
        }
        return result;
    }

    // Time complexity: O(n^2)

    // public int numIdenticalPairs(int[] nums) {
    //     int count = 0;
    //     for(int i = 0; i< nums.length;i++){
    //         for(int j = 0; j< nums.length ;j++){
    //             if(nums[i] == nums[j] && i<j){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
}