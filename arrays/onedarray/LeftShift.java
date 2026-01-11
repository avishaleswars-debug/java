package arrays.onedarray;

public class LeftShift {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=arr[0];
        int right=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
arr[i-1]=arr[i];
if(i==arr.length-1) arr[i]=left;
        }
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=arr[i+1];
        }
        for(int i:arr) System.out.print(i+" ");
    }
}
