public class Disariumnum {
    public static void main(String[] args) {
        int n=135;
        int copy=n;
        int copy2=n;
        int sum=0;
        int c=0;
        while(copy!=0){
            copy/=10;
            c++;
        }
        while(n!=0){
            int t=n%10;
            int prod=1;
for(int i=c;i>=1;i--){
prod*=t;
}

sum+=prod;
//System.out.println(sum+" "+prod);
n/=10;
c--;

        }
 if(copy2==sum){
    System.out.println("disarium number");
}
else{
    System.out.println("not disarium number");
}
    }
}
