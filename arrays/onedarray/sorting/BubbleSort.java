public class BubbleSort {
    public static void main(String atgs[]){
        int arr[]={1,9,3,8,4,77,5,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int l : arr) {
            System.out.print(l+" ");
        }
    }
}
