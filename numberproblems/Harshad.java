package numberproblems;

public class Harshad {
    public static void main(String[] args) {
        int n=123;
        int copy=n;
        int sum=0;
        while(n!=0){
            int t=n%10;
            sum+=t;
            n/=10;
        }
        if(copy%sum==0){
            System.out.println("its a harshad number");
        }
        else{
          System.out.println("not a harshad number");  
        }
    }
}
