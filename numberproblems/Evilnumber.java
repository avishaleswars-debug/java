package numberproblems;

public class Evilnumber {
    public static void main(String[] args) {
        int n=2;
        int temp=n;
        int c=0;
        while (temp>0) {
            if(temp%2==1){
                c++;
            }
            temp/=2; 
        }
        if(c%2==0){
            System.out.println("its is a evil number");
        }
        else{
            System.out.println("not evil number");
        }
    }
}
