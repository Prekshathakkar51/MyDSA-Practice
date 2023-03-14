class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        long sum =0;
        
        for(Integer i: chalk)
            sum += i;
        
        long l = k % sum;
        
        for(int i=0; i<chalk.length;i++)
        {
            if(l >= chalk[i])
                l = l - chalk[i];
            else
                return i;
        }
        return -1;
        
    }
}