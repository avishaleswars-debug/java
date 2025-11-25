package numberproblems;

public class Palindromenum {
    public static void main(String[] args) {
        int num=1221;
        String s=String.valueOf(num);
        String str=new StringBuilder(s).reverse().toString();
if(s.equals(str)){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}
    }
}
