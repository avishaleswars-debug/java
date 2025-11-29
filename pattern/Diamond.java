public class Diamond{
    public static void main(String args[]) {
        int p=10;
        for(int i=1;i<=p/2;i++){
            for(int j=p/2;j>=i;j--){
System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int m=1;m<=p/2;m++){
            for(int n=1;n<=m;n++){
                System.out.print(" ");
            }
            for(int b=p/2*2-1;b>=m*2-1;b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}