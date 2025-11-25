package numberproblems;

public class Productnum {
    public static void main(String args[]){
        int n=12387;
       int prod=1;
        while(n!=0){
            int t=n%10;
            prod*=t;
            n/=10;
        }
        System.out.println(prod);
    }
}
