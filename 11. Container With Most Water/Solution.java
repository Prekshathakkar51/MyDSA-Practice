class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length-1;
        // int h = 0;
        int w = 0;
        int temp = 0;

        while(i<j){
           int h = Math.min(height[i],height[j]);
            w = j-i;
            temp = Math.max(temp, h*w);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return temp;
        
    }
}