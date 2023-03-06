class Solution {
    public int largestAltitude(int[] gain) {
// here we declare 2 variables , 1 to store the increasing value and secomd to store the max of all

// Time : O(n)
// Space : O(1)
        int compare = 0;
        int result = 0;

        for(int climb: gain){
            compare += climb;
            result = Math.max(result,compare);
        }
        return result;
        
    }
}