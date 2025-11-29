public class Reverse {
    public static void main(String[] args) {
        String str="hello";
        String reverse="";
        int n =str.length();
        while(n>0){
           reverse+=str.charAt(n-1);
           n--;
        }
        System.out.println(reverse);
    }
}
