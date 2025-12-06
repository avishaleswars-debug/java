public class ConsecutiveSum {
    public static void main(String[] args) {
        int n=15;
        int sum=0;
        int count=0;
        for(int i=1;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=j;
                if(sum==n){
                    count++;
                    break;
                }
                if(sum>n) {
                   break;
                }
                 
            }
        }
        System.out.print(count);
    }
}
