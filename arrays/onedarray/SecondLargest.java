package arrays.onedarray;
public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,5};
        int first=Integer.MIN_VALUE;
int second=0;
        for (int i : arr) {
            if(i>first){
                second=first;
                first=i;
            }
            else{
                if(second<i&&second!=i){
                    second=i;
                }
            }
       
        }
        System.out.println(second);
    }
}
