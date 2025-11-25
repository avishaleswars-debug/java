package numberproblems;

public class DiffEvenOdd {
    public static void main(String[] args) {
        int n=123456;
        int evensum=0;
        int oddsum=0;
        while(n!=0){
            int t=n%10;
           if(t%2==0){
            evensum+=t;
           }
           else{
            oddsum+=t;
           }
            n/=10;
        }
        System.out.println(evensum+" "+oddsum);
    }
}
