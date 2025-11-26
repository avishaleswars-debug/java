package numberproblems;

public class Ducknum {
    public static void main(String[] args) {
        int n=7909;
      boolean ans=false;
        while(n!=0){
           int t=n%10;
            if(t==0) {
                System.out.println("ist a duck number");
                ans=true;
                break;
            }
            n/=10;
        }
        if(!ans){
            System.out.println("not duck number");
        }
    }
}
