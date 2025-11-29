package arrays.Searching;

public class PatternMatch {
    public static void main(String[] args) {
        String str="abcaacdabcab";
        String pat="abc";
        for(int i=0;i<=str.length()-pat.length();i++){
            int j;
            for ( j = 0; j < pat.length(); j++) {
                if(str.charAt(i+j)!=pat.charAt(j)) {
break;
                }
            }
if(j==pat.length()){
    System.out.println(i);
}
        
        }
    }
}
