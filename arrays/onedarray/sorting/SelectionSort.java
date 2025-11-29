public class SelectionSort{
    public static void main(String args[]){
        int arr[]={1,3,5,7,0,4,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}