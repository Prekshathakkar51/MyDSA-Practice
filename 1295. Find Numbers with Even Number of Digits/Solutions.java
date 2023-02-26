class Solution {
    public int findNumbers(int[] nums) {
        // here we are incrementing the count as we encounter an even digit number.
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    
    }

    boolean even(int num){
        // this will check if the number of digits of a number are even or not
        int numOfD = digit(num);
//        if (numOfD %2 == 0){
//            return true;
//        }
//        return false;

        return (numOfD % 2 == 0);


    }

    int digit(int num){
        // this will count the number of digits of a number in the array
        return (int)(Math.log10(num) + 1);
    }
}