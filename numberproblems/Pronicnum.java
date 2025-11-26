package numberproblems;

public class Pronicnum {
    public static void main(String[] args) {
        int n=10;
        boolean ans=false;
        for(int i=0;i<=n;i++){
            if(i*(i+1)==n){
                System.out.println("it is a Pronic num");
                ans=true;
                break;
            }
        }
if(!ans){
    System.out.println("not a pronic number");
}
    }
}
