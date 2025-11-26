
public class Armstrongnum{
    public static void main(String args[]){
        int n=153;
        int copy=n;
        int copy2=n;
        int len=0;
        while(n!=0){
            n/=10;
            len++;
        }
        int sum=0;
        while(copy!=0){
            int temp=copy%10;
            int prod=1;
        for(int i=1;i<=len;i++){
prod*=temp;
        }
       // System.out.println(prod+" "+sum);
        sum+=prod;
        copy/=10;
    }
    if(sum==copy2){
        System.out.println("armstrong number");
    }
    else{
         System.out.println("not armstrong number");
    }
    }
}