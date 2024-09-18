class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int rec=0;
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            if(c==' '){
                len=0;
            }else{
                len++;
                rec=len;
            }
        }
        return rec;
    }
}