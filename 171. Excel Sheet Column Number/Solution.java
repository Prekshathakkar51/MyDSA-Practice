class Solution {
    public int titleToNumber(String columnTitle) {

        int ans = 0;

        for(char s: columnTitle.toCharArray()){
            int d = s - 'A' +1;
            ans = ans*26 + d;
        }
        return ans;
    }
}