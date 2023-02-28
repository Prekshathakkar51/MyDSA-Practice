class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // create buckets for storing the count of each number of the array
        // 101 coz, in constraints we have nums[i] = 100 at max
        int[] buc = new int[102];

// get the frequency of each element
        for(int num: nums){
            buc[num]++;
        }

// count smaller number than each element
        for(int i = 1; i<buc.length;i++){
            buc[i]+= buc[i-1];

        }

// Populate the result
        int[] res = new int[nums.length];
        for(int i = 0; i< res.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }
            else{
                res[i] = buc[nums[i]-1];
            }
        }
        return res;
    }
}

// Time Complexity : O(n)
// Space COmplexity: O(1)