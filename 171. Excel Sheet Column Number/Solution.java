class Solution {
    public int titleToNumber(String columnTitle) {

        int ans = 0;

        for(char s: columnTitle.toCharArray()){
            ans = ans*26;
            ans = ans + (s -'A' + 1);
        }
        return ans;
    }
}