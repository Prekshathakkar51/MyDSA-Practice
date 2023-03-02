class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean flag = false;

        for( char ch = 'a'; ch<= 'z'; ch++){
            boolean panagram = CheckPanagram(ch, sentence);

            if(panagram == false){
                flag = false;
                break;
            }else{
                flag = true;
            }
        }
        return flag;
        
    }

    public boolean CheckPanagram(char ch, String str){
        for(char c: str.toCharArray()){
            if(c == ch )
            return true;
        }
        return false;
        

    }
}