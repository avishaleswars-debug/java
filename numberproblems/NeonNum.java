public class NeonNum {
    public static void main(String[] args) {
        int n=123;
        int sum=0;
        int copy=n;
        double sqare=Math.pow(n, 2);
        while(n!=0){
            int t=n%10;
            sum+=t;
            n/=10;
        }
        if(sum==copy&&sqare==copy){
            System.out.println("neonnumber");
        }
        else{
            System.out.println("not neon num");
        }

    }
}
