class Solution {
    public String convertToTitle(int columnNumber) {

        String ret = "";
        while (columnNumber != 0) {
            ret = (char)('A'+(--columnNumber)%26) + ret;
            columnNumber /= 26;
        }
        return ret;     
    }
}