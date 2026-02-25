class LC1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
      StringBuilder sb = new StringBuilder();     
        for(char c:s.toCharArray()){
            if(st.isEmpty()){
sb.append(c);
st.push(c);
            }else if(st.peek()==c)){
st.pop();
sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
st.push(c);
            }
        }
         return sb.toString();
    }
}