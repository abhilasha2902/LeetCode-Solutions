class Solution {
    public String clearDigits(String s) {
        Set<Integer> st=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0'&& c<='9'){
                st.add(i);
                st.add(stack.pop());
            }else stack.push(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.contains(i))
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}