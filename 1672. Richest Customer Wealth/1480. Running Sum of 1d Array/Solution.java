class Solution {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        // creating a new array named result
        int[] result = new int[nums.length];
        // using for loop we take the elemt from nums and sum it pushing in result
        for(int i = 0; i<result.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;

        
    }
}