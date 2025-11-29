package arrays.onedarray;
public class RightRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int last=arr[n-1];
  for(int i=0;i<n-1;i++){
    arr[i]=arr[i+1];
  }
        arr[0]=last;
        for (int k : arr) {
            System.out.print(k);
        }
    }
}
//not