package numberproblems;

public class AddFirstAndLast {
    public static void main(String[] args) {
         int num=1234;
        int last=num%10;
        int first=num;
        while(first>10){
            first/=10;
        }
        System.out.println(first+last);
    }
}
