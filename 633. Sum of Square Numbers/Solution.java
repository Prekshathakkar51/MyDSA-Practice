class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j =(long) Math.sqrt(c);

        while(i<=j){
            long sum = (long)Math.pow(i,2) + (long)Math.pow(j,2);
            if(sum == c){
            return true;
            }
            else if(sum > c ){
            j--;
            }
            else{
            i++;
            }            
        }    
    return false;
}
}