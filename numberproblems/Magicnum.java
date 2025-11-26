public class Magicnum {
    public static void main(String[] args) {
        int n=10;
        int sum=n;
        while(sum>9){
            n=sum;
            sum=0;
            while(n!=0){
           int  t=n%10;
            sum+=t;
            n/=10;
            }
        }
       if(sum==1){
        System.out.println("magic number");
       }
       else{
                System.out.println("not magic number");
       }
    }
}
