class Solution {
    public int numberOfCuts(int n) {
        int cuts = 0;

        if(n %2 !=0){
            cuts = n;
        }
        else{
            cuts = n/2;
        }
        return cuts;
        
    }
}