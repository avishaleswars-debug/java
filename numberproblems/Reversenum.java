package numberproblems;

public class Reversenum {
    public static void main(String[] args) {
        int num=1234;
        int val=0;
        while(num!=0){
            int t=num%10;
            val=val*10+t;
            num/=10;
        }
        System.out.println(val);
    }
}
