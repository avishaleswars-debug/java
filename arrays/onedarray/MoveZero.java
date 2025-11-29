package arrays.onedarray;
public class MoveZero {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,0,4,5};
        int write=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[write--]=arr[i];
            }
        }
        while(write>=0){
            arr[write--]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
