public class Spynum {
    public static void main(String[] args) {
        int n=123;
        int sum=0,prod=1;
        while(n!=0){
            int t=n%10;
            sum+=t;
            prod*=t;
            n/=10;
        }
        if(sum==prod){
            System.out.println("Spy num");
        }
        else{
            System.out.println("not Spy num");
        }
    }
}
