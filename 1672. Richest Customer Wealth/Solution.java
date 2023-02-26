class Solution {
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans  = Integer.MIN_VALUE;
        for(int[] row : accounts ){
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for(int col : row ){
                sum += col;
            }

            // now we have sum of accounts of person
            //check overall value

            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
    
